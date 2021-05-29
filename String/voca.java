package String;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


//대문자의 범위는 십진수로 65~90
//소문자의 범위는 십진수로 97~122
//즉 C를 입력받았을 때, 배열의 세번째 원소인 2를 도출해 내려면 67-65
public class voca {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str="";
        int[] arr= new int[26];

        str = br.readLine();

        for(int i=0; i<str.length(); i++){
            //str에 소문자가 들어왔을 때
            if(('a' <= str.charAt(i)) && (str.charAt(i) <= 'z')){
                arr[str.charAt(i) - 97]++;
            }
            //str에 대문자가 들어왔을 때
            else{
                arr[str.charAt(i) - 65]++;
            }
        }

        int max=-1; //가장 많은 char을 출력시키기 위해 비교하기위한 max
        char c = '?';   //같은 것이 2개 이상일땐 '?'출력
        String temp="";
        StringTokenizer st = new StringTokenizer(str);
        
        


        bw.write(temp);
        bw.flush();
        bw.close();
    }
    
}
