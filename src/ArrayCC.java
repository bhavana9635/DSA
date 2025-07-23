public class ArrayCC
{
    /*
    //Linear Search
    public static int LinearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 11;
        int index = LinearSearch(numbers, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key is at the index "+ index);
        }


    }*/



    /*

    //Find the largest number in the array
    public static int Largest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {

            if (largest < numbers[i]) {
                largest=numbers[i];
            }
            if(smallest > numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest element " + smallest);
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        System.out.print("Largest element " + Largest(numbers));
    }*/

    /*public static int binarySearch(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end) /2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }
    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 10;
        System.out.print("index for key is  " + binarySearch(arr,key));
    }*/
    /*
    // Reverse an array
    // swapping is imp........
    public static void reverse(int arr[]) {
        int start = 0;
        int last = arr.length - 1;
        while (start < last) {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) { // Print all elements including the last
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }*/

}
