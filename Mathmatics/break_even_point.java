package Mathmatics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class break_even_point {
    public static void main(String[] args) throws IOException{

        //고정비용+(n*가변비용) = n*판매비용
        //n*(판매비용 - 가변비용) = 고정비용
        //n = 고정비용 / (판매비용 - 가변비용)
        //n = A / (C - B)
        //즉, n > 0 보다 커지는 순간 +1을 해준게 손익분기점

        int[] a= new int[3];
        int n=0;
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //a = Integer.parseInt(br.readLine());
    
        StringTokenizer st = new StringTokenizer(br.readLine());
       
       for(int i=0; i < 3; i++){
        a[i] = Integer.parseInt(st.nextToken());
       }
        
       //C-B가 0이되면 무한대로 가버림..
       //즉, C-B <= 0
       // C <= B  (이익이 발생하지 않는 조건: -1)


       if( a[2] <= a[1]){
            System.out.println("-1");
       }
       else{
           System.out.println(a[0]/(a[2] - a[1])+1);
       }
    }
}
