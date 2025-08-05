package classes;

import java.util.Scanner;

public class Sscanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name=sc.next();
        System.out.print("Enter your rollNo : ");
        int rollno= sc.nextInt();
        System.out.print("Enter your marks : ");
        float marks=sc.nextFloat();
        System.out.println("Hello : "+name+ " your roll number is" + rollno+ " your mark is "+marks );
    }
}
