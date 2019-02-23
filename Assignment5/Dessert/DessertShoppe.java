package Dessert;

public class DessertShoppe {
    final double taxRate=2;
    final int maxItemNameSize=50;
    final int widthOfdisplayonRecipt=10;
    final String shopName="M & M Dessert     Shoppe";

    public String cents2dollarsAndCentsmethod(int numOfCents){
          int remain=numOfCents%100;
          int dollar=numOfCents/100;
          return "$"+dollar+"."+remain;
    }





}
