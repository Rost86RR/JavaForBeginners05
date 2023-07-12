package homework.weather;

public class Weather {
    public static void main(String[] args){

        double weatherToday = 14;
        double weatherTomorrow = 15;
        String city = "London";

        System.out.println(
                "текущая погода: \t"
                        + weatherToday
                        + "°C, \n"
                + "погода на завтра \t"
                        + weatherTomorrow
                        + "°C, \n"
                + "в городе: \t\t\t"
                        + city
        );
    }
}
