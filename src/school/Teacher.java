package school;

public class Teacher extends Person{
    public static void main(String[] args) {

        String firstName = "Иван";
        String middleName = "Петрович ";
        String lastName = "Серебряков";
        String subj = "математика";
        int age = 55;

        System.out.println("-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//");
        System.out.println(
                "First name: \t"
                        + firstName
                        + ", \n"
                        + "Middle name: \t"
                        + middleName
                        + ", \n"
                        + "Last name: \t\t"
                        + lastName
                        + ", \n"
                        + "Age: \t\t\t"
                        + age
                        + ", \n"
                        + "Subject: \t\t" + subj
        );
        System.out.println("-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//");
    }
}
