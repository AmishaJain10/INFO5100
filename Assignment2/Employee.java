
class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month

    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;

    }

    // Getter for `name`. Return the current `name` data
    public String getName() {
        //write your code here
        return this.name;

    }

    // Setter for `name`. Set `name` data
    public void setName(String name) {
        //write your code here
        this.name = name;
    }

    public void raiseSalary(double byPercent) {
        this.salary= (salary * byPercent) / 100;
    }


}

enum Gender {
    MALE,
    FEMALE;
}



