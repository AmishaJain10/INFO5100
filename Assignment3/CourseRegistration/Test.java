package CourseRegistration;

public class Test {

    public static void main(String arg[]) {

        Course course1 = new Course("Java Programming");
        System.out.println("Course name is: " + course1.getCourseName()+"\n");
        System.out.println("maximum students in one course is 3\n");


        Student student1 = new Student("Amisha", 1);
        Student student2 = new Student("Arpita", 2);
        Student student3 = new Student("Arshi", 3);

        course1.registerStudent(student1);
        course1.registerStudent(student2);
        course1.registerStudent(student3);

        //Below Student registration fails, As course can have maximum 3 students
       /*Student("Richa", 4);
        course1.registerStudent(student4);*/

    }
}
