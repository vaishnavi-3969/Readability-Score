package readability;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
//        char[] n = s.toCharArray();
                //stage 1/5;
//        String o = n.length>100?"HARD":"EASY";
//        System.out.println(o);
        //stage 2/6;
        String[] str = s.split("[.!?]+");
        int[] n = new int[str.length];
        for(int i=0; i<str.length; i++){
            n[i] = str[i].split("\\s+").length;
        }
//        System.out.println(Arrays.toString(str));
//        System.out.println(Arrays.toString(n));
        int sum = 0;
        for(int i=0; i<n.length; i++){
            sum = sum + n[i];
        }
        int avg = sum / str.length;
//        System.out.println(avg);
        if(avg > 10){
            System.out.println("HARD");
        }else {
            System.out.println("EASY");
        }
    }
}
