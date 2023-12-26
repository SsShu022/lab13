package ucu.edu.task2;

public class DataBase extends БазаДаних{
    
    public String getUserData() {
        return отриматиДаніКористувача();
    }
    public String getStatistic() {
        return отриматиСтатистичніДані();
    }
}
