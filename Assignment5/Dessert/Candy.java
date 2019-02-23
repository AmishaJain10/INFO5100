package Dessert;

public class Candy extends DessertItem {
    double weight;
    int pricePerPound;

    Candy(String name, int pricePerPound, double weight) {
        super(name);
        this.pricePerPound = pricePerPound;
        this.weight = weight;

    }

    public int getCost() {
        int cost = (int) (pricePerPound * weight);
        return cost;
    }

    public String printPrice(){
        return weight+ " lbs"+ "@" + pricePerPound+ " /lb" ;
    }

}

