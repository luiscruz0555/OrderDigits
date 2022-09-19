package WeekOfSep19;

import java.util.*;

public class SecondMax {

    public static void findSecondMax(ArrayList<ArrayList<Integer>> list, int N){
        for(int i = 0; i < N ; i++){
            ArrayList<Integer> trips = new ArrayList<Integer>();
            for(int j = 0; j < 3 ; j++){
                trips.add(list.get(i).get(j));
            }
            Collections.sort(trips);
            System.out.println(trips.get(1));
        }
    }
    
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        int N = scnr.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i < N ; i++ ){
            ArrayList<Integer> trips = new ArrayList<Integer>();
            for(int j = 0; j < 3 ; j++){
                trips.add(scnr.nextInt());
            }
            list.add(trips);
        }

        findSecondMax(list, N);

        scnr.close();
    }

}
