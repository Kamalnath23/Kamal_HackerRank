import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args)  {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        if(n>=2&&n<=20){
            for(int i=1;i<=10;i++){
                int m=n*i;
                System.out.println(n+" x "+i+" = "+m);
            }
        }
        else{
            
        }
    }
}




