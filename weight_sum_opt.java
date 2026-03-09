import java.util.*;
class weight_sum_opt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,weight;
        System.out.println("enter the array size and target weight");
        n=sc.nextInt();
        weight=sc.nextInt();
        int[] w=new int[n];
        System.out.println("enter the wights of the elements");
        for(int i=0;i<n;i++)
            w[i]=sc.nextInt();
        int[][] dp=new int[n+1][weight+1];
        for(int i=1;i<=n;i++)
        {
            for (int j=0;j<=weight;j++)
            {
                if(w[i-1]>j)
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=Math.max(dp[i-1][j],w[i-1]+dp[i-1][j-w[i-1]]);
            }
        }
        System.out.println("the max sum is: "+dp[n][weight]);
    }
}