package String;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class croatia_alphabet {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str="";

        str = br.readLine();

        String[] word = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        int cnt=0;

        for(int i=0; i< word.length; i++){

            //str과 word[]와 비교해서 str안에 word[]와 같은게 포함하는지
            if(str.contains(word[i]))
            {
                //str에서 word[]와 같은게 있으면 *로 바꾼다
                str =  str.replaceAll(word[i], "*");
            }
        }

        System.out.println(str.length());
      

    }
}
