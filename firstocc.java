package searching;

import java.util.Scanner;
class twoapp{
    public int linearap(int a[], int n, int x)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i]==x)
            return i;
        }
        return -1;
    }
    public int iterativeap(int a[], int n, int x) {
        int s=0,l=n-1;
        while(s<=l)
        {
            int m=(s+l)/2;
            if(a[m]>x)
            l=m-1;
            else if(a[m]<x)
            s=m+1;
            else if(a[m]==x)
            {
                if(m==0||a[m]!=a[m-1])
                return m;
                else 
                l=m-1;
            }
        }
        return -1;
    }
}
public class firstocc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int x = s.nextInt();
        twoapp t = new twoapp();
        int y = t.linearap(a,n,x);
        System.out.println("by linear approach ="+y);
        int z = t.iterativeap(a, n, x);
        System.out.println("by iterative approach="+z);

    }
}
