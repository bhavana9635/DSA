public class selectionsorting {
    public static void selectionSort(int nums[]){
        for(int i = 0;i<nums.length-1;i++){
            int minpos = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[minpos]>nums[j]){
                    minpos = j;
                }
            }
            //swap
            int temp = nums[minpos];
            nums[minpos] = nums[i];
            nums[i] = temp;
        }
    }
    public static void main(String args[]){
        int nums[] = {5,4,1,3,2};
        selectionSort(nums);
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i] +" ");
        }
        System.out.println( );
    }
}//n2 complexity but no swaps much.

