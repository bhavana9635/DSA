public class first {

    public static int binaryserach(int menu[],int key){
        int start = 0; int end = menu.length-1;

        while(start <= end){
            int mid = (start + end)/2;
            if(menu[mid]==key){
                return mid;
            }
            if(menu[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;


    }
    public static void main(String args[]) {
        int menu[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 12;
        System.out.println("the index of key is : "+ binaryserach(menu,key));
    }
}


// log2n complexity