package Dessert;

public class Cookie extends DessertItem {
    int centsPerDz,count;
    Cookie(String name,int count,int centsPerDz ){
    super(name);
    this.centsPerDz=centsPerDz;
    this.count=count;


    }

    public int getCost(){
        int priceperCookie=this.centsPerDz/12;
      int cost=count*priceperCookie;
      return cost;
    }

    public String printPrice(){
        return count +" @" + count+" /dz" ;
    }
}


