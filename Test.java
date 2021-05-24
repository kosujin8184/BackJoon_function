import java.util.*;
import java.lang.*;


public class Test {

  public static void main(String[] args){

    int n;
    
    Scanner scanner = new Scanner(System.in);

    n=scanner.nextInt();
    int[] a = new int[n];

    for(int i=0; i<a.length; i++){
        a[i]=scanner.nextInt();
        System.out.println(a[i]);
    }

    long x = sum(a);
    System.out.println(x);

  }


  public static long sum(int[] a){

    long temp = 0;

    for(int i=0; i<a.length; i++){
        temp  = temp + a[i];
    }

    return temp;
  }

}