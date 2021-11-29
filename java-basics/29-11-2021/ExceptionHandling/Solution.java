import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println(x/y);
        } catch(ArithmeticException ae) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch(InputMismatchException ime){
            System.out.println("java.util.InputMismatchException");
        }

    }
}