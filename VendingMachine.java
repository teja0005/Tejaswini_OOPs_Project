import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to Teja's Super Vending Machine");
        System.out.println("Select the Items: ");
        Product p=new Product();
        p.displayItems();
        Cart c=new Cart();
        int out=0;
        do{
            System.out.println("You want to add/remove/exit: ");
            String s=in.next().toLowerCase();
            switch(s){
                case "add":
                    c.addItems(in.nextInt());
                    break;
                case "remove":
                    c.removeItems(in.nextInt());
                    break;
                case "exit":
                    out=1;
                    break;
                default:
                    System.out.println("Try choosing again");
            }
        }while(out==0);
        Billing b=new Billing();
        do{
            System.out.println("Choose any payment from the below: Cash/Card ");
        }while(b.paymentMethod(in.next()));
        System.out.println(b.bill(c.getPrices()));
        System.out.println("Please collect your items...Thanks for shopping...Have a nice day...");
    }
}