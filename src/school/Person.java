package school;

public class Person {
    public static void main(String[] args){

        int yob = 1990;
        System.out.println("Если человек родился в " + yob + " году, то его возраст - разница между 2022 и " + yob);

        int yob2 = 1999;
        int year = 2021;
        System.out.println("Если человек родился в " + yob2 + " году, то его возраст 2 года назад - разница между "
                + year + " и " + yob2);
    }
}
