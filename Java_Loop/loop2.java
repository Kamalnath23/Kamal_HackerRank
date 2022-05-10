import java.util.*;
import java.io.*;
import java.math.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
        int e;
        int count=0;
        if(q>0 && q<=500){
            
        
        for(int i=0;i<q;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            if(a>=0 && a<=50){
                if(b>=0 && b<=50){
                    if(n>=1&&n<=15){
                        for(int j=0;j<n;j++){
                            a=a+ ((int)Math.pow(2,j) *b);
                            System.out.print(a+" ");
                        }
                        System.out.println();
                    }
                    else{
                        break;
                    }
                }
                else{
                    break;
                }
            }
            else{
                break;
            }
            
          
        }
        
        }
        else{
            
        }
        in.close();
    }
}

