//https://www.hackerrank.com/test/143hd7jsid6/questions/521e954e6ff11
import java.util.Scanner;
 public class Fizzbuzz
 {
    static void Intcheck(int i,int n)
    {
        for(i=1;i<n;i++)
        {
           if(i%3==0 && i%5==0)
            System.out.println("FizzBuzz");
            else if(i%3==0)
            System.out.println("Fizz");
            else if(i%5==0)
            System.out.println("Buzz");
           else if(i%5!=0 || i%3!=0)
            System.out.println(i);
        }
        public static void main(String[] args) {
            System.out.println();
        }



    }











 }