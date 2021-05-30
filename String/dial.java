package String;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class dial {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str="";

      //다이얼
      //A B C D E F G H I J K L M N O P Q R S T U V W X Y Z  ->다이얼 알파벳
      //2 2 2 3 3 3 4 4 4 5 5 5 6 6 6 7 7 7 7 8 8 8 9 9 9 9  ->다이얼
      //3 3 3 4 4 4 5 5 5 6 6 6 7 7 7 8 8 8 8 9 9 9 10 10 10 ->초
    
        String dial = br.readLine();
        int sec = 0;

        for(int i=0; i<dial.length(); i++){

            switch(dial.charAt(i)){

                case 'A': case 'B': case 'C':
                    sec+=3;
                    break;
                case 'D' : case 'E' : case 'F':
                    sec+=4;
                    break;
                case 'G' : case 'H' : case 'I':
                    sec+=5;
                    break;
                case 'J' : case 'K' : case 'L':
                    sec+=6;
                    break;
                case 'M' : case 'N' : case 'O':
                    sec+=7;
                    break;    
                case 'P' : case 'Q' : case 'R' : case 'S':
                    sec+=8;
                    break;       
                case 'T' : case 'U' : case 'V':
                    sec+=9;
                    break;
                case 'W' : case 'X' : case 'Y' : case 'Z':
                    sec+=10;
                    break;
                default:
                     break;       
                   
            }

           

        }
        
        System.out.println(sec);

        bw.close();


    }
}
