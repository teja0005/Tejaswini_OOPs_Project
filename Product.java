public class Product{
    String[] products={"Milk","Biscuits","Sugar","Curd","Diary Milk","Lays","Choco"};
    int[] prices={30,10,30,15,10,10,10};
    public void displayItems(){
        for(int i=0;i< products.length;i++){
            System.out.println(i+"  -"+products[i]+"  -  $"+prices[i]);
        }
    }

}
