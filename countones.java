package searching;

import java.util.Scanner;
class bsch{
    public int count(int a[], int n) {
        int s=0,l=n-1;
        while(s<=l)
        {
            int m=(s+l)/2;
            if(a[m]==0)
            {
                s=m+1;
            }
            else if((m==0 && a[m]==1) ||(m!=0 && a[m]==1 && a[m]!=a[m-1]))
            {
                return n-m;
            }
            else{
                l=m-1;
            }
        }
        return 0;
    }
}
class countones
{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n =s1.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s1.nextInt();
        }
        bsch b = new bsch();
        int x = b.count(a, n);
        System.out.println("count of 1 is "+x);
    }
}