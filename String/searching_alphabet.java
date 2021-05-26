package String;
import java.util.*;

public class searching_alphabet {
    
    public static void main(String[] args) {


        String s="";
        int[] c = new int[26];
        Scanner sc=new Scanner(System.in);

       
        for(int i=0; i<26; i++){
            c[i] = -1;
        }

        s = sc.next();

        //char형에서 'a'는 아스키코드로 97
        //charAt(i)는 i번째의 문자를 반환
        for(int i=0; i < s.length(); i++){
            if( c[s.charAt(i)-97] == -1){
                c[s.charAt(i)-97] = i;
            }
            
        }

        for(int i=0; i < 26; i++){
            System.out.print(c[i] + " ");
        }

        sc.close();

    }
}
