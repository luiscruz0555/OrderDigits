import java.util.ArrayList;
import java.util.Collections;

public class OrderDigits {
    
    public static int [] orderDigits(int [] arr, String s){

       if(s.toLowerCase().equals("ascending")){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int number = 0;
        int digit = 0;
        String newNum = "";
        for(int i = 0 ; i < arr.length ; i++){
            number = arr[i];
            newNum ="";
            //System.out.println("newNum value: "+newNum);
            list= new ArrayList<Integer>();

            while(number > 0){
                digit = number % 10; 
                list.add(digit);
                number = number / 10;
            }
            Collections.sort(list);
            for(int j = 0; j<list.size() ; j++){
                newNum = newNum + String.valueOf(list.get(j));
            }
            number = Integer.parseInt(newNum);
            arr[i] = number;
            
        }

    }else if(s.toLowerCase().equals("descending")){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int number = 0;
        int digit = 0;
        String newNum = "";
        for(int i = 0 ; i < arr.length ; i++){
            number = arr[i];
            newNum ="";
            //System.out.println("newNum value: "+newNum);
            list= new ArrayList<Integer>();

            while(number > 0){
                digit = number % 10; 
                list.add(digit);
                number = number / 10;
            }
            Collections.sort(list);
            Collections.reverse(list);
            for(int j = 0; j<list.size() ; j++){
                newNum = newNum + String.valueOf(list.get(j));
            }
            number = Integer.parseInt(newNum);
            arr[i] = number;
            
        }

        
    }
    return arr;
    }

    public static int[] orderDesc(int [] arr){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int number = 0;
        int digit = 0;
        String newNum = "";
        for(int i = 0 ; i < arr.length ; i++){
            number = arr[i];
            newNum ="";
            //System.out.println("newNum value: "+newNum);
            list= new ArrayList<Integer>();

            while(number > 0){
                digit = number % 10; 
                list.add(digit);
                number = number / 10;
            }
            Collections.sort(list);
            Collections.reverse(list);
            for(int j = 0; j<list.size() ; j++){
                newNum = newNum + String.valueOf(list.get(j));
            }
            number = Integer.parseInt(newNum);
            arr[i] = number;
            
        }

        return arr;
    }
    public static void main(String[] args) {
     
        int [] arr = {65461, 46419, 64135};
        int [] newArr = orderDigits(arr, "ascending");
        for(int i = 0 ; i < newArr.length ; i++){
            System.out.print(newArr[i] + " ");
        }

        System.out.println();

        int [] arr2 = {65461, 46419, 64135};
        int [] newArr2 = orderDigits(arr2, "descending");
        for(int i = 0 ; i < newArr2.length ; i++){
            System.out.print(newArr2[i] + " ");
        }

       // System.out.println("Don't mind me I'm just a sorted number");


    }

}
