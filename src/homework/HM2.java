package homework;

public class HM2 {
    public static void main(String[] args){

        int number = 3;
        int x = 7;
        int y = 4;
        int z = 16;
        int sumXY = x + y;
        int multiXZ = x * z;
        int subYZ = y - z;
        int apple = 100;
        int student = 21;
        int appleDivideForStudents = apple / student;
        int appleForTeacher = apple % student;
        String task = "Task ";
        String afterEachTask = "_________________________________________________________";
        String sumOfXY = "Sum of x and y = ";
        String multiOfXZ = "x * z = ";
        String subOfYZ = "Sub of Y and Z = ";
        String appleTask = "Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит по "
                + appleDivideForStudents + " яблока, и " + appleForTeacher + " яблока останется учителю";
        int lemon9Task = 6;
        int apple9Task = lemon9Task + 24;
        int pear9Task = apple9Task - 12;
        int sumFruits9Task = lemon9Task + apple9Task + pear9Task;




        System.out.println(task + number);
        System.out.println(x + " \n" + y + " \n" + z + " \n");
        System.out.println(x + " " + y + " " + z);
        System.out.println(afterEachTask);

        System.out.println(task + (++ number));
        System.out.println("int x = 7, int y = 4, int z = 16");
        System.out.println(afterEachTask);

        System.out.println(task + (++ number));
        System.out.println(x + ", " + y + ", " + z);
        System.out.println(afterEachTask);

        System.out.println(task + (++ number));
        System.out.println(sumOfXY + sumXY);
        System.out.println(multiOfXZ + multiXZ);
        System.out.println(subOfYZ + subYZ);
        System.out.println(afterEachTask);

        System.out.println(task + (++ number));
        System.out.println(appleTask);
        System.out.println(afterEachTask);

        System.out.println(task + (++ number));
        System.out.println(sumFruits9Task);
        System.out.println(afterEachTask);

        System.out.println(task + (++ number));
        System.out.println("I did it in my mind");
        System.out.println(afterEachTask);

        int threeFive = 35;
        int seven = 7;
        int divideFirst = threeFive / seven;
        String firstTask = "35 more than 7 in " + divideFirst + " times";
        int eight = 8;
        int fourEight = 48;
        int divideSecond = fourEight / eight;
        String secondTask = "8 less than 48 in " + divideSecond + " times";
        int fiveFour = 54;
        int six = 6;
        int subThird = fiveFour - six;
        String thirdTask = "54 more than 6 on " + subThird;

        System.out.println(task + (++ number));
        System.out.println(firstTask);
        System.out.println(secondTask);
        System.out.println(thirdTask);
        System.out.println(afterEachTask);

        System.out.println(task + (++ number));
        System.out.println("easy task");
        System.out.println(afterEachTask);



    }
}
