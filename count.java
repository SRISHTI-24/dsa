package searching;

import java.util.Scanner;
class countno{
    public int linearfreq(int a[], int n, int x) {
        int rk=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==x)
            rk++;
        }
        return rk;
    }
    public int  itfreq(int a[], int n, int x) {
        int s=0,l=n-1,rk=0;
        while(s<=l)
        {
            int m=(s+l)/2;
            if(a[m]>x)
            l=m-1;
            else if(a[m]<x)
            s=m+1;
            else {
                rk++;
            }
        }
        return rk;
    }
}
public class count {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        a[i] = s.nextInt();
        int x = s.nextInt();
        countno c = new countno();
        System.out.println("freq of x is = "+c.linearfreq(a,n,x));
        System.out.println("freq of x is = "+c.itfreq(a, n, x));
    }
}
