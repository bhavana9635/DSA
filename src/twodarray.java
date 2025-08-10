import java.util.*;
public class twodarray
{
    public static boolean Search(int array[][],int key)
    {
        for(int i = 0;i<array.length;i++)
        {
            for(int j = 0;j<array[0].length;j++)
            {
                if(array[i][j]==key){
                    System.out.print("Found at index "+ "("+i+","+j+")");
                    return true;

                }

            }

        }
        System.out.println("Key is not found");
        return false;
    }

    public static void main(String args[])
    {
        int array[][] = new int[3][3];
        int n = array.length;
        int m = array[0].length;

        //Input of matrix
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                array[i][j] = sc.nextInt();
            }

        }
        //Outpur of matrix
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
        Search(array,10);
    }

}
