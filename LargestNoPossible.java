import java.util.Arrays;
import java.util.Scanner;
public class LargestNoPossible {
    static int largestNo(int[] arr, int n)
    {
        Arrays.sort(arr);
        String res="";
        for(int i =n-1;i>=0;i--)
        {
            res=res+arr[i];
            //num=num* Math.pow(10,i-1);
        }
        System.out.println(res);
        char[] c=res.toCharArray();
        int r=0;
        for(int i=0;i<c.length;i++){
            r+=(c[i]-48)*Math.pow(10,c.length-i-1);
            System.out.println((int)c[i]);
        }
        return r;
    }
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(largestNo(arr,n));
    }
}
