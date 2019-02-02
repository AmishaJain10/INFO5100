package CourseRegistration;

public class Student {

    private String name;
    private int ID;

    //constructor
    Student(String name, int ID)
    {
        this.name=name;
        this.ID=ID;
    }

    String getStudentName()
    {
        return this.name;

    }
    int getStudentId()
    {
        return this.ID;

    }



}


