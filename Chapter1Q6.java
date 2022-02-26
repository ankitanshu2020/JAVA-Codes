import java.util.*;

public class Chapter1Q6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the marks of English");
        float eng = scn.nextFloat();
        System.out.println("Enter the marks of Maths");
        float mat = scn.nextFloat();
        System.out.println("Enter the marks of Science");
        float sci = scn.nextFloat();
        System.out.println("Enter the marks of History");
        float his = scn.nextFloat();
        System.out.println("Enter the marks of Hindi");
        float hin = scn.nextInt();
        System.out.println("Enter your total marks");
        float total_marks = scn.nextFloat();
        float total_obtained_marks = eng + mat + sci + his + hin;
        float percentage = (float) (total_obtained_marks / total_marks * 100);
        System.out.println("Your percentage is  " + percentage);

    }
}
