import java.util.*;
public class array1 {
    /*

    //Linear Search
    public static int LinearSearch(String menu[],String key){
        for(int i =0;i<menu.length;i++){
            if (menu[i].equals(key)) {
                return i;
            }
        }

        return -1;

    }
    public static void main (String args[]){
        String menu[] = {"aloo","gobi","Dosa","Idli"};
        String key = "potato";

        int index = LinearSearch(menu,key);
        if(index == -1 ){
            System.out.println("Not Found");
        }else
            System.out.println("The string is in index :"+ index);

    }*/
   //Largest or smallest int in array
    public static int largest(int[] menu){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i =0;i<menu.length;i++){
            if(largest<menu[i]){
               largest = menu[i];
            }

            if(smallest>menu[i]){
                smallest = menu[i];
            }


        }

        System.out.println("The smallest value is :"+smallest);
        return largest;
    }

    public static void main(String args[]) {
        int menu[] = {2, 4, 6, 8, 10, 12, 14};
        System.out.println("the largest number is :"+largest(menu));
    }
}