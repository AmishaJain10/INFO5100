package Dessert;

public class TestCheckOut {
    public static void main(String[] args) {
        DessertShoppe ds=new DessertShoppe();
        Checkout checkout = new Checkout();
        checkout.enterItem(new Candy("Peanut Butter Fudge", 225, 3.99));
        checkout.enterItem(new IceCream("Vanilla Ice Cream", 105));
        checkout.enterItem(new Sundae("Choc. Chip Ice Cream", 145, "Hot Fudge", 50));
        checkout.enterItem(new Cookie("Oatmeal Raisin Cookies", 4, 399));
        System.out.println("\nNumber of items: " + checkout.numberOfItems());
        System.out.println("\nTotal cost: " + ds.cents2dollarsAndCentsmethod((int)checkout.totalCost()));
        System.out.println("\nTotal tax: " + ds.cents2dollarsAndCentsmethod((int)checkout.totalTax()));
        System.out.println("\nCost + Tax: " + ds.cents2dollarsAndCentsmethod((int)(checkout.totalCost() +
                checkout.totalTax())));
        System.out.println(checkout);

        checkout.clear();
        checkout.enterItem(new IceCream("Strawberry Ice Cream", 145));
        checkout.enterItem(new Sundae("Vanilla Ice Cream", 105, "Caramel",
                50));
        checkout.enterItem(new Candy("Gummy Worms", 133, 0.89));
        checkout.enterItem(new Cookie("Chocolate Chip Cookies", 4, 399));
        checkout.enterItem(new Candy("Salt Water Taffy", 150, 2.09));
        checkout.enterItem(new Candy("Candy Corn", 300, 1.09));
        System.out.println("\nNumber of items: " + checkout.numberOfItems()
                + "\n");
        System.out.println("\nTotal cost: " + ds.cents2dollarsAndCentsmethod((int)checkout.totalCost()));
        System.out.println("\nTotal tax: " + ds.cents2dollarsAndCentsmethod((int)checkout.totalTax()));
        System.out.println("\nCost + Tax: " + ds.cents2dollarsAndCentsmethod((int)(checkout.totalCost() +
                checkout.totalTax())));
        System.out.println(checkout);
    }

}
