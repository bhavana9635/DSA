import java.util.*;
public class Array {

    //pairs...
    /*public static void pairs(int arr[]){
        int tp = 0;
        int sum =  0;
        for(int i = 0;i<arr.length;i++){
            int curr = arr[i];
            for(int j = i+1;j<arr.length;j++){
                System.out.print("("+ curr+","+ arr[j] +")");
                sum+=arr[i];
                tp++;
            }
            System.out.println();



        }System.out.println("Total number pairs = "+ tp);


    }

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        pairs(arr);

    }
   // print subarray
    public static void printSubarr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }


    }

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        printSubarr(arr);
    }

    public static void printSubarr(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum = 0;
                for (int k=i;k<=j;k++){
                    //subarray sum
                    sum+=arr[k];
                }  System.out.println("Subarray sum [" + i + " to " + j + "] = " + sum);
                if (max < sum){
                    max= sum;

                }

            }

        }
        System.out.println("Max sum = "+ max);


    }

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        printSubarr(arr);
    }

    //prefix

    //kadane algo
    public static void printSubarr(int arr[])
    {
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for(int i = 0;i<arr.length;i++)
        {
            cur = cur +arr[i];
            if (cur < 0){
                cur = 0;
            } max = Math.max(cur,max);

        }
        System.out.println("Max sum of the array is = "+ max);
    }

    public static void main(String args[]){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        printSubarr(arr);
    }

    //print the max of the subarray sum
    public static void printSubarr(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum = 0;
                for (int k=i;k<=j;k++){
                    //subarray sum
                    sum+=arr[k];
                }  System.out.println("Subarray sum [" + i + " to " + j + "] = " + sum);
                if (max < sum){
                    max= sum;

                }

            }

        }
        System.out.println("Max sum = "+ max);


    }

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        printSubarr(arr);
    }*/

    // count of the subarray's

    /*public static void printSubarr(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum = 0;
                for (int k=i;k<=j;k++){
                    //subarray sum
                    sum+=arr[k];
                }  System.out.println("Subarray sum [" + i + " to " + j + "] = " + sum);
                if (max < sum){
                    max= sum;

                }

            }

        }
        System.out.println("Max sum = "+ max);


    }

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        printSubarr(arr);
    }*/

    public static int buyandsellstocks(int price[]){
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
        buyandsellstocks(price);
    }


}


