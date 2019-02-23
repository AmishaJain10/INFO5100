package Dessert;

import java.util.Vector;

public class Checkout {

    DessertShoppe ds = new DessertShoppe();
    Vector<DessertItem> itemList = new Vector();//dessert items list

    public int numberOfItems() {
        return this.itemList.size();
    }

    public void enterItem(DessertItem item) { // Dessert item is added to list
        itemList.add(item);
    }

    public void clear() { // Clear method clears  all vector items
        itemList.clear();
    }

    public double totalCost() {
        double totalCost = 0;
        for (int i = 0; i < itemList.size() - 1; i++) {
            totalCost += itemList.elementAt(i).getCost(); //gets cost of each DessertItem

        }
        return totalCost;
    }

    public double totalTax() {

        double tax = (totalCost() * ds.taxRate) / 100;
        return tax;
    }

    public String toString() {
        StringBuilder sbr = new StringBuilder();
        sbr.append("\n");
        sbr.append("\n");
        sbr.append("\t\t\t\t" + ds.shopName);
        sbr.append("\n");
        sbr.append("\t\t\t\t" + new String(new char[ds.shopName.length()]).replace("\0", "-"));
        for (int i = 0; i < itemList.size(); i++) {
            sbr.append("\n");

            String price = itemList.get(i).printPrice();
            if (price != null) {
                sbr.append(price);
                sbr.append("\n");
            }
            String name = itemList.get(i).getName();
            int ind = name.lastIndexOf("\n");
            int lastLineLength = ds.maxItemNameSize - name.length();
            if (ind >= 0) {
                lastLineLength = ds.maxItemNameSize - ind;
            }
            String printName = name + new String(new char[lastLineLength]).replace("\0", " ");
            sbr.append(printName);

            sbr.append(ds.cents2dollarsAndCentsmethod(itemList.get(i).getCost()));
        }
        sbr.append("\n");
        String name = "Tax";
        String printtax = name + new String(new char[ds.maxItemNameSize - name.length()]).replace("\0", " ");
        sbr.append(printtax);
        sbr.append(ds.cents2dollarsAndCentsmethod((int) totalTax()));
        sbr.append("\n");
        name = "Total";
        String printtotal = name + new String(new char[ds.maxItemNameSize - name.length()]).replace("\0", " ");
        sbr.append(printtotal);
        sbr.append(ds.cents2dollarsAndCentsmethod((int) totalTax() + (int) totalCost()));
        sbr.append("\n");
        sbr.append(new String(new char[ds.maxItemNameSize - name.length()]).replace("\0", "-"));
        return sbr.toString();

    }


}
