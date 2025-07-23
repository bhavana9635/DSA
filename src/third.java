import java.util.*;
public class third {
    public static void printpairs(int menu[]){

        int tp =0;
        for(int i =0;i< menu.length;i++){
            int curr = menu[i];
            for(int j = i+1;j<menu.length;j++){
                System.out.print("("+ menu[i] +","+ menu[j] + ")");
                tp++;

            }
            System.out.println();
        }
        System.out.println("Total Number of pairs "+tp);
    }
    public static void main(String args[]) {
        int menu[] = {2, 4, 6, 8,10};
        printpairs(menu); // calling inside main fuction is imp
    }
}
//o(n2)