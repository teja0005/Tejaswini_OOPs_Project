//Given a sorted array of integers “nums” and an integer target, return indices for two
// numbers such that they add up to the target.  You may assume that each input would
// have exactly one solution, and you may not use the same element twice. You can return the
// answer in any order.
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target=in.nextInt();
        int check=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((nums[i]+nums[j])==target){
                    System.out.print(i+","+j);
                    check=1;
                    break;
                }
            }
            if(check==1) break;
        }
    }
}
