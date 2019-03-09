package Assignment6.PartC;

import java.util.Calendar;

public class Dog extends Pet implements Boardable {
    private String size;
    Calendar startBoardCal = Calendar.getInstance();
    Calendar endBoardCal = Calendar.getInstance();
    //constructor
    Dog (String name, String ownerName, String color, String size)
    {
        super(name,ownerName,color);
        this.size=size;
    }
    String getSize() // returns the string size
    {
        return this.size;
    }


    public String toString(){

        return "DOG :"+"\n"+super.toString()+"\nsize: "+getSize();
    }

    /* method that returns a String that identifies the pet as Dog and returns a complete description of the dog, including the values stored in the Pet parent class. */

    public void setBoardStart(int month, int day, int year) {
        startBoardCal.set(year, month, day);
    }


    public void setBoardEnd(int month, int day, int year) {
        endBoardCal.set(year, month, day);
    }

    public boolean boarding(int month, int day, int year) {
        Calendar checkCal = Calendar.getInstance();
        checkCal.set(year, month, day);
        return startBoardCal.getTimeInMillis() <= checkCal.getTimeInMillis() && endBoardCal.getTimeInMillis() >= checkCal.getTimeInMillis();

    }
}
