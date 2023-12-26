package ucu.edu.task3;



import java.io.IOException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;


public class BrenfetchRequest  {

    public static void fetchBrand(String brandName) throws IOException{
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
        .addHeader("Authorization", "Bearer " + "GRk/SuvPro7lov132NwyPWOTPhTULMv/Lc6/6eOQy20=")
        .url("https://api.brandfetch.io/v2/brands/" + brandName)
        .get()
        .addHeader("accept", "application/json")
        .build();

        Response response = client.newCall(request).execute();
        ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); 

        Brand entity = objectMapper.readValue(response.body().string(), Brand.class);
        System.out.println(entity);
    }

}
