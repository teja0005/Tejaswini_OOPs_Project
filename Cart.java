public class Cart extends Product{
    int[] items={-1,-1,-1,-1,-1,-1,-1};
    int f=0;
    public void addItems(int j){
        for(int i=0;i<7;i++){
            if(this.items[i]==j){
                f=1;
                break;
            }
        }
        if(f==0){
            for(int i=0;i<7;i++){
                if(this.items[i]<0){
                    this.items[i]=j;
                    break;
                }
            }

        }
    }
    public void removeItems(int s) {
        int flag=0;
        for (int k = 0; k < 7; k++) {
                if (this.items[k] == s) {
                    flag=1;
                    this.items[k]=-1;
                    break;
                }
            }
        if(flag==0){
            System.out.println("There are no items to delete");
        }
    }

    public int[] getPrices(){
        int[] cartPrices=new int[5];
        int j=0;
        for(int i=0;i<7;i++){
            if(this.items[i]>=0){
                cartPrices[j]=super.prices[this.items[i]];
                j++;
            }

        }
        return cartPrices;
    }

}
