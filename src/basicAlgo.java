public class basicAlgo {

    public static void bubbleSort(int nums[]){
        for(int turn = 0;turn<nums.length-1;turn++){
            for(int j=0;j<nums.length-1-turn;j++){
                //compare with the adjcent element and swap
                if (nums[j] > nums[j+1]) {
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        int nums[] = {5,4,1,3,2};
        bubbleSort(nums);
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
        System.out.println();

    }
}
//n2 complexity..
//if it sorted also same the complexity..