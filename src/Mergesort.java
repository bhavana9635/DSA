public class Mergesort{
    public static void Mergesort(int arr[],int si,int ei) {

        //  Base case
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        Mergesort(arr,si,mid);//left part
        Mergesort(arr,mid+1,ei);//right part
        merge(arr,si,mid,ei);// merging after sorting
    }

    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si; // for the left side part
        int j = mid+1; //for right side of the part
        int k = 0 ; //for temp array

        while(i<= mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else {
                temp[k] = arr[j];
                j++;
            }k++;

        }

        //left side part
        while(i<=mid){
            temp[k++] = arr[i++];

        }
        //right side part
        while(j<=ei){
            temp[k++] = arr[j++];

        }
        //copying the array to original one
        for(k=0,i=si;k<temp.length;k++,i++){
             arr[i] = temp[k] ;
        }
    }
    public static void main(String[] args){
        int arr[] = {6, 3, 9, 5, 2, 8};

        Mergesort(arr, 0, arr.length - 1);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}


// quicksort  codde
/*public class Mergesort {
    public static void Quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pIdx= partition(arr,si,ei);
        Quicksort(arr,si,pIdx-1);
        Quicksort(arr,pIdx+1,ei);


    }
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;// i for the making place which will be -1
        for(int j = si ; j < ei; j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i ;


    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};

        Quicksort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
*/