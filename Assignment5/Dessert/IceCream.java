package Dessert;

public class IceCream extends DessertItem {
    int cents;
    IceCream(String name,int cents){
      super(name);
      this.cents=cents;
    }

    public int getCost(){
        return this.cents;

    }

     public String printPrice(){
        return null;
     }
}
