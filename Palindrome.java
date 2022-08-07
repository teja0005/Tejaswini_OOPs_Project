import java.util.Locale;
import java.util.Scanner;
public class Palindrome {
    public static boolean checkPalindrome(char[] c,int i,int n){
        if(i==(n-1)){
            return true;
        }
        if(c[i]!=c[n-1]){
            return false;
        }
        if(c[i]==c[n-1-i]){
            return checkPalindrome(c,i+1,n-i-1);
        }
        return true;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.next().toLowerCase();
        char[] c=s.toCharArray();
        System.out.println(checkPalindrome(c,0,c.length));
    }
}
