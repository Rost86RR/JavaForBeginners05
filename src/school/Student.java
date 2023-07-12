package school;

public class Student extends Person{
    public static void main(String[] args){

        String firstName1 = "Вова ";
        String firstName2 = "Маша";
        String lastName1 = "Сидоров";
        String lastName2 = "Семенова";
        int age1 = 10;
        int age2 = 14;
        int class1 = 5;
        int class2 = 9;

        System.out.println("-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//");
        System.out.println(
                "First name: \t"
                        + firstName1
                        + ", \n"
                        + "Last name: \t\t"
                        + lastName1
                        + ", \n"
                        + "Age: \t\t\t"
                        + age1
                        + ", \n"
                        + "Class: \t\t\t" + class1
        );
        System.out.println("-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//");
        System.out.println(
                "First name: \t"
                        + firstName2
                        + ", \n"
                        + "Last name: \t\t"
                        + lastName2
                        + ", \n"
                        + "Age: \t\t\t"
                        + age2
                        + ", \n"
                        + "Class: \t\t\t" + class2
        );
        System.out.println("-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//");
    }
}
