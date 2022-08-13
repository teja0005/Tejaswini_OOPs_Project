public class Billing extends Cart{
    float bill=0;
    int flag=0;
    public float bill(int[] prices){
        for(int i:prices){
            bill+=i;
        }
        if(flag==1){
            return 2*bill;
        }
        return bill;
    }
    public boolean paymentMethod(String s){
        if(s.toLowerCase().equals("card")){
            flag=1;
            System.out.print("Your Bill is: $");
            return false;
        }
        else if(s.toLowerCase().equals("cash")){
            System.out.print("Your Bill is: $");
            return false;
        }
        else{
            return true;
        }
    }

}
