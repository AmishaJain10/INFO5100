package Dessert;

public class Sundae extends IceCream {
   int toppingCost;
   String toppingName;
    Sundae(String name,int cents,String toppingName,int toppingCost){
     super(name,cents);

     this.toppingName=toppingName;
     this.toppingCost=toppingCost;

    }

    public int getCost(){
        int iceCreamCost=super.getCost();
        return iceCreamCost+this.toppingCost;
    }


    public String getName()
    {
        return this.name + " with\n" + this.toppingName;
    }

}
