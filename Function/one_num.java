package Function;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;


public class one_num {
    public static void main(String[] args) throws NumberFormatException, IOException{

        int N;
        Scanner sc = new Scanner(System.in);

        //Scanner보다 BufferedReader를 사용하는게 더빠르다. 런타임 에러 줄이기위해.
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int N = Integer.parseInt(br.readLine());

        N = sc.nextInt();

       System.out.println(num(N));
    }

    public static int num(int n){

        int cnt=0;

        //등차수열 a+(n-1)d
        if(n<100){
            return n;
        }
        else if((n>=100)&(n<=1000)){
          
            if(n==1000){
                n= 999;
            }
           

                for(int i=100; i<=n; i++){

                    int[] chk = new int[3];

                    chk[0] = i/100;
                    chk[1] = (i/10)%10;
                    chk[2] = (i%10);

                    if((chk[0]-chk[1])==(chk[1]-chk[2])){
                        cnt++;
                    }
                }
                
            

            return 99+cnt;
            
        }
        else{
            return 0;
        }

    }
    
}
