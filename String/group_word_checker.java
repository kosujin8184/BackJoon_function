package String;

import java.util.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


//이거 좀 어려움...
public class group_word_checker {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{

       int cnt=0;
       int num = Integer.parseInt(br.readLine());

       for(int i=0; i<num;  i++){
           if(check() == true){
                cnt++;
           }
       }

       System.out.println(cnt);

    }

    //연속된건지 아닌지 체크하는 함수
    public static boolean check() throws IOException{

        boolean[] chk = new boolean[26];
        int prev = 0;
        String str = br.readLine();

        for(int i=0; i<str.length(); i++){
            //i번째 문자를 저장한다.
            int now = str.charAt(i);

            //전의 문자와 i번째 문자가 같지않다면
            if(prev != now){

                //해당 문자가 처음 나오는 경우
                if(chk[now - 'a'] == false){
                    chk[now - 'a'] = true;  //다음엔 처음이 아니라서 true
                    prev = now; //다음 반복문을 위해 prev는 now가 됨
                }
                //해당 문자가 처음이 아닌 경우
                else{
                    return false;
                }
            }
            //전의 문자와 i번째 문자와 같다면(연속)
            else{
                continue;
            }
        }

        return true;
    }
}
