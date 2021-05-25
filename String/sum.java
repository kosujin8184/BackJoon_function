package String;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class sum {
    public static void main(String[] args) throws IOException{
        
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int sum=0;

        for(byte value : br.readLine().getBytes()){
            sum += (value-'0');
        }

/*
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String num = sc.next();
        sc.close();

        int sum=0;

        for(int i=0 ; i< n; i++){
            sum += num.charAt(i) - '0'; //charAt(i)는 i번째 char의 아스키 코드를 받아온다.
                                        // -'0' 또는 -48 을 해줘야 숫자값으로 나온다.
        }
*/
        System.out.println(sum);

    }
    
}
