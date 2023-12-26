package ucu.edu;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Авторизація авторизація = new Авторизація();
        if (авторизація.авторизуватися(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
