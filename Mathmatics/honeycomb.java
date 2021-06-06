package Mathmatics;

import java.lang.*;
import java.util.*;


//어려움
public class honeycomb {
    public static void main(String[] args){

        int honeycomb_cnt=1, des=2;
        int N=0;

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

       
            
            if(N == 1){
                System.out.println(N);
            }
            else{
                while(des <= N){
                    des = des + (6*honeycomb_cnt);
                    honeycomb_cnt++;
                }

                System.out.println(honeycomb_cnt);
            }
    
       

    }
}
