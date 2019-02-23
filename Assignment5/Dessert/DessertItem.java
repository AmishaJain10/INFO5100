package Dessert;

public abstract class DessertItem {
    String name;

    public DessertItem(String name){
        this.name=name;
    }
    //methods
    public String getName()
    {
        return this.name;
    }

    public abstract int getCost(); //abstract method
    public abstract String printPrice(); //abstract method

    }

