package String;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class word_num {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str="";

        str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        System.out.println(st.countTokens());

        //bw.write(st.countTokens()); //토큰 개수 반환하는 함수
        //bw.flush();
        bw.close();

    }
}
