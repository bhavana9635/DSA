public class fifth
{
    public static void Maxsumsub(int menu[])
    {

        int curr = 0;
        int Maxsum = Integer.MIN_VALUE;
        for(int i =0;i< menu.length;i++)
        {

            for(int j = i;j<menu.length;j++)
            {
                curr =0;
                for(int k = i;k<=j;k++)
                {
                    curr += menu[k];
                    System.out.println(curr);
                    if(Maxsum<curr){
                        Maxsum = curr;
                    }

                }
            }
        }System.out.println("The MAX SUM of SUB arrays " + Maxsum);

    }
    public static void main(String args[]) {
        int menu[] = {1,-2,6,-1,3};
        Maxsumsub(menu); // calling inside main fuction is imp
    }
}

//n3 time complexity
