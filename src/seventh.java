import java.util.*;
public class seventh {
    public static void Kadane(int menu[]){
        int cs =0;
        int ms = Integer.MIN_VALUE;
        for(int i =0;i<menu.length;i++){
            cs = cs+menu[i];
            if(cs<0){
                cs =0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("MAximum sum = "+ms);

    }
    public static void main(String args[]) {
        int menu[] = {1,-2,6,-1,3};
        Kadane(menu); // calling inside main fuction is imp
    }
}
