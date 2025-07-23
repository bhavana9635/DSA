import java.util.*;
public class fourth{
    public static void printpairs(int menu[]){

        int ts = 0;
        for(int i =0;i< menu.length;i++){
            int curr = menu[i];
            for(int j = i;j<menu.length;j++){
               for(int k = i;k<=j;k++){
                   System.out.print(menu[k]);//sub array


               } ts++;
                System.out.println();

            }
            System.out.println();
        }
        System.out.println("Total number of sub arrays "+ts);
    }
    public static void main(String args[]) {
        int menu[] = {2, 4, 6, 8,10};
        printpairs(menu); // calling inside main fuction is imp
    }
}
//o(n2)