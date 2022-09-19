package WeekOfSep19;

import java.util.*;

public class StringSum {

    public static int findStringSum(String s){

        int sum = 0;
        

        for(int i = 0 ; i < s.length() ; i++){
            String num = "";
            if(Character.isDigit(s.charAt(i))){
                num = num + s.charAt(i);
                sum = sum + Integer.parseInt(num);
            }
        }


        return sum;
    }
    
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);

        String s = scnr.nextLine();

        System.out.println(findStringSum(s));

        scnr.close();

    }

}
