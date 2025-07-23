import java.util.*;

//buy and sell stocks
/*public class buyandsellstock {
    public static int buyandsell(int price[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0;i<price.length;i++){
            if(buyprice < price[i]){
                int profit = price[i]-buyprice;
                maxprofit = Math.max(maxprofit,profit);
            }else{
                buyprice = price[i];
            }

        }return maxprofit;
    }


    public static void main(String args[]){
        int price[] = {7,1,5,3,6,4};
        buyandsell(price);
//        int maxProfit = buyandsell(price);
//        System.out.println("MAX PROFIT = " + maxProfit);
    }
}*/



//Bubble sort
public class buyandsellstock {

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        bubbleSort(arr); // Call bubbleSort function
    }
}
