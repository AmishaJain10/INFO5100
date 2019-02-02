package CourseRegistration;

public class Course {

    private String name;
    private int noOfStudents;
    private int classSize;
    private Student[] students;

    //constructor
    Course(String name) {
        this.name = name;
        noOfStudents = 0;
        classSize = 3;
        students = new Student[10];
    }


    String getCourseName() {

        return this.name;
    }

    //return array of registered Students
    Student[] getStudents() {

        return students;
    }

    //return true if course is full
    boolean isFull() {
        if (noOfStudents >= classSize)
            return true;
        else return false;
    }

    //register student if course class is not full

    void registerStudent(Student student) {
        if (isFull()) {
            System.out.println("Cannot register, Course is full\n");
        } else {
            students[noOfStudents] = student;
            noOfStudents++;
            System.out.println("Successfully registered "+student.getStudentName() + "  having StudentID " + student.getStudentId()+"\n");

        }

    }


}
