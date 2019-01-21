/**
 * Assignment for your lecture 2. Please finish all the questions under 'Assignment'
 * Please try to finish the extra credit question. 
 * The deadline of this assignment is 01/25/2019 23:59 PST.
 * Please feel free to contact Fiona for any questions.
 * TA office hour: Tuesday 1 pm -- 4 pm
 */

class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month

    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
    		//write your code here
    }
    
    // Getter for `name`. Return the current `name` data
    public String getName() {
    		//write your code here
    }

    // Setter for `name`. Set `name` data
    public void setName(String name) {
    		//write your code here
    	
    }
}

enum Gender {
    MALE,
    FEMALE;
}
