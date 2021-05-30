package String;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class constant {
    public static void main(String[] args) throws IOException{

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] num=new int[2];
        Scanner sc = new Scanner(System.in);

        num[0] = sc.nextInt();
        num[1] = sc.nextInt();

        int[][] comp = new int[2][3];
        int[] res= new int[2];

        comp[0][0] =  (num[0]/100);
        comp[0][1] = ((num[0]%100)/10)*10;
        comp[0][2] = (num[0]%10)*100;
        res[0] = comp[0][0] + comp[0][1] + comp[0][2];
        
        comp[1][0] =  (num[1]/100);
        comp[1][1] = ((num[1]%100)/10)*10;
        comp[1][2] = (num[1]%10)*100;
        res[1] = comp[1][0] + comp[1][1] + comp[1][2];

        if(res[0] > res[1]){
           
            System.out.println(res[0]);
        }
        else if(res[0] < res[1]){
              
            System.out.println(res[1]);
        }
         

        
        sc.close();
       

    }
}
