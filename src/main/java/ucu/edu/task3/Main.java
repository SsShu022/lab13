package ucu.edu.task3;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args) throws IOException{
        List<String> brands = new ArrayList<>();
        brands.add("cam.ac.uk");
        brands.add("ox.ac.uk");
        brands.add("harvard.edu");

        for (String brand : brands) {
            BrenfetchRequest.fetchBrand(brand);
        }
    }
}
