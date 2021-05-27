package String;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import 	java.lang.StringIndexOutOfBoundsException;

public class String_repetition{

    public static void main(String[] args) throws IOException, StringIndexOutOfBoundsException{

/*
        String t = "";
        int r=0;
        int num =0;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        for(int k=0; k < num; k++){

            r = sc.nextInt();
            t = sc.nextLine();
            t = t.trim(); //공벡제거
           

                for(int i=0; i < t.length(); i++){
                    for(int j=0; j<r; j++){
                        System.out.print(t.charAt(i));
                    }
                }
                System.out.println();
        }

        sc.close();
       */

        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//버퍼에 입력
        
        int index = Integer.parseInt(br.readLine());//버퍼에 입력된거 정수형으로 변환시켜 num에 할당

        for(int i=0; i<index; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());  //br에 한줄씩 ""기준으로 끊어서 st에 삽입
            int num=Integer.parseInt(st.nextToken());//st의 하나하나가 정수형으로 변환

            String str=st.nextToken(); //c에 자른 st넣기
            String temp="";

            for(int j=0; j<str.length(); j++){
                for(int k=0; k<num; k++){
                        temp += str.charAt(k);
                }
            }
            temp.trim();
            System.out.println(temp);
        }


        br.close();
        
    }

}