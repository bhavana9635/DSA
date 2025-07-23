public class sixth
{
    public static void Maxsumsub(int menu[])
    {

        int curr = 0;
        int Maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[menu.length];
        prefix[0] = menu[0];
        for(int i = 1; i<prefix.length;i++)
        {
            prefix[i] = prefix[i-1]+menu[i];
        }


        for(int i =0;i< menu.length;i++)
        {

            for(int j = i;j<menu.length;j++)
            {
                curr = i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                //for(int k = i;k<=j;k++){
//                    curr += menu[k];
//                    System.out.println(curr);
                    if(Maxsum<curr){
                        Maxsum = curr;
                    }
            }
        }System.out.println("The MAX SUM  " + Maxsum);

    }
    public static void main(String args[]) {
        int menu[] = {1,-2,6,-1,3};
        Maxsumsub(menu); // calling inside main fuction is imp
    }
}

//n2 time complexity
