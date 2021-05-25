package Function;
import java.util.*;

public class self_number {
    
    static boolean[] chk = new boolean[10000];

    public static void main(String[] args){

        for(int i=1; i<10000; i++){
            d(i);
        }

        for(int i=1; i<10000; i++){
            //생성자 없는거 출력하기 위함.
            if(!chk[i]){
                System.out.println(i);
            }

        }

    }

    public static int d(int n){

        int temp=0;

       if(n < 10){
        //한 자리
            temp = 2*n; //생성자 존재
            chk[temp] = true;
       }
       else if((n < 100) & (n >=10)){
        //두 자리
            int[] num = new int[2];
            num[0] = n/10;  //10의자리 구하기
            num[1] = n%10;  //1의자리 구하기

            temp = n+num[0]+num[1];
            chk[temp] = true;   //생성자 존재하는거 true
       }
       else if((n>=100)&(n<1000)){
            //세 자리
            int[] num = new int[3];
            num[0] = n/100;  //100의자리 구하기
            num[1] = (n%100)/10;  //10의자리 구하기
            num[2] = n%10;  //1의자리 구하기

            temp = n+num[0]+num[1]+num[2];
            chk[temp] = true;   //생성자 존재하는거 true
       }
       else if((n>=1000)&(n<10000)){
            //네 자리
            int[] num = new int[4];
            num[0] = n/1000;  //1000의자리 구하기
            num[1] = (n%1000)/100;  //100의자리 구하기
            num[2] = (n%100)/10;  //1의자리 구하기
            num[3] = n%10;  //1의자리 구하기

            temp = n+num[0]+num[1]+num[2]+num[3];
            if(temp>=10000){return 0;}
            chk[temp] = true;   //생성자 존재하는거 true
       }
       else{
           return 0;
       }

       return d(temp);
    }

}
