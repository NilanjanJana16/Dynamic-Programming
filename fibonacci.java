import java.io.*;
import java.util.*;

public class fibonacci{

public static void main(String[] args) throws Exception {
    // write your code here

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int fibans = Fib(n, new int[n+1]);
    System.out.println(fibans);
 }

 public static int Fib(int n, int[] qb){

     if(n==0 || n==1){
         return n;
     }
     if(qb[n] != 0){
         return qb[n];
     }

     int fib1 = Fib(n-1, qb);
     int fib2 = Fib(n-2, qb);
     int fibn = fib1+ fib2;

     qb[n] = fibn;

     return fibn;
 }

}