package data.structure;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by memoona on 7/31/17.
 */
public class UseArrayLIst {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number: ");
        for(int i=0; i<5; i++) {
            list.add(sc.nextInt());
        }
        for(int i=0; i<list.size(); i++){
        System.out.println(list.get(i));
    }
        try{
            if(sc!=null) {
                sc.close();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
}
}
