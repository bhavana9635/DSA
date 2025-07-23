public class second {
    public static void reverse(int menu[]){
        int start = 0;
        int end = menu.length-1;
        while(start<end){
            //swap
            int temp = menu[end];
            menu[end] = menu[start];
            menu[start] = temp;

            start++;
            end--;

        }
    }

    public static void main(String args[]) {
        int menu[] = {2, 4, 6, 8, 10, 12, 14};
        reverse(menu);
        for(int i=0 ;i<menu.length;i++){
            System.out.print(menu[i]+" ");
        }
        System.out.println();
    }
}
// time = n
// space =1