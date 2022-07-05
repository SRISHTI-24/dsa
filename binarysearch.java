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
    int binarys(int a[], int n, int s, int l, int t) {
        int m=(s+l)/2;
        if(s>=l)
        return -1;
        if(a[m]==t)
        {
            return m;
        }
        else if(a[m]>t)
        {
            return binarys(a, n, 0, m-1, t);
        }
        else
        {
            return binarys(a, n, m+1, l, t);
        }
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
        int y = b.binarys(a, n, 0, n-1, t);
        if(rk == true && y!=-1)
        System.out.println("yes element is present at" + (y-1));
        else
        System.out.println("no element is not present");
        

    }
}
