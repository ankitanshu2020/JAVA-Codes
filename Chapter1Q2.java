import java.util.*;
public class Chapter1Q2 {
    public static void main(String [] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the marks of Maths out of 100");
        int m=scn.nextInt();
        System.out.println("Enter the marks of Science out of 100");
        int s=scn.nextInt();
        System.out.println("Enter the marks of English out of 100");
        int e=scn.nextInt();
        float avg=(m+s+e)/3;
        float sgpa=avg/10;
        System.out.println("Your SGPA is  " + sgpa);


    }
}
