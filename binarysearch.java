package searching;
import java.util.Arrays;
import java.util.Scanner;
class bs{
    public boolean bsearch(int a[], int n, int t) {
        int s=0,l=n-1;
        while(s<=l)
        {
            int m = (s+l)/2;
            if(a[m]==t)
                return true;
            else if(a[m]>t)
                {
                    l=m-1;
                }
            else{
                s=m+1;
            }
        }
        return false;
        
    }
}
class binarysearch{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = s.nextInt();
        System.out.println("now enter the elements of the array");
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        System.out.println("enter an element u want to search");
        int t=s.nextInt();
        bs b = new bs();
        Arrays.sort(a);
        boolean rk = b.bsearch(a, n, t);
        if(rk == true)
        System.out.println("yes element is present");
        else
        System.out.println("no element is not present");
    }
}