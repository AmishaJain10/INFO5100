package Assignment6.PartC;

public class Pet {
    private String name;
    private String ownerName;
    private String color;
    static final int MALE = 1, FEMALE = 2, SPAYED = 3, NEUTERED = 4;
    protected int sex;

    //constructor
    Pet(String name, String ownerName, String color) {
        this.name = name;
        this.ownerName = ownerName;
        this.color = color;
    }

    String getName() {
        return this.name;

    }

    String getOwnerName() {
        return this.ownerName;
    }

    String getColor() {
        return this.color;
    }

    void setSex(int sexid) {
        this.sex = sexid;
    }

    String getSex()// Should return the string equivalent of the gender, e.g the string “MALE” etc.
    {
        int sexId = this.sex;
        switch (sexId) {
            case 1:
                return "MALE";

            case 2:
                return "FEMALE";

            case 3:
                return "SPAYED";

            case 4:
                return "NEUTERED";
        }
        return "invalid Sex";
    }


    public String toString() // Should return the name, owner’s name, age, color, and gender (use getSex());
    {
        return this.name + " owned by " + this.ownerName + "\nColor: " + this.color + " \nSex:  " + this.getSex();
    }
}
