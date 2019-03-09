package Assignment6.PartC;

import java.util.Calendar;

import java.time.LocalDate;

public class Cat extends Pet implements Boardable {
    private String hairLength;

    Calendar startBoardCal = Calendar.getInstance();
    Calendar endBoardCal = Calendar.getInstance();

    //constructor
    Cat(String name, String ownerName, String color, String hairLength) {
        super(name, ownerName, color);
        this.hairLength = hairLength;
    }

    String getHairLength() {
        return this.hairLength;
    }

    public String toString() {

        return "CAT :" + "\n" + super.toString() + "\nHairLength: " + getHairLength();
    }

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
