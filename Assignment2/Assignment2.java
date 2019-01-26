public class Assignment2 {
    // Assignment

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public double socialSecurityTax(Employee employee) {
        //write your code here
        double socialSecurityTax;

        if (employee.salary <= 8900) {
            socialSecurityTax = employee.salary * .062;
        } else {
            socialSecurityTax = 106800 * .062;
        }
        return socialSecurityTax;
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public static double insuranceCoverage(Employee employee) {
        //write your code here
        double empInsurance = 0.0;
        if (employee.age < 35)
            empInsurance = employee.salary * .03;
        else if (35 <= employee.age && employee.age <= 50)
            empInsurance = employee.salary * .04;
        else if (50 < employee.age && employee.age < 60)
            empInsurance = employee.salary * .05;
        else if (employee.age > 60)
            empInsurance = employee.salary * .06;

        return empInsurance;

    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public void sortSalary(Employee e1, Employee e2, Employee e3) {
        //write your code here
        if (e1.salary < e2.salary && e1.salary < e3.salary) {
            if (e2.salary < e3.salary)
                System.out.println("Low to high: " + e1.name + " " + e2.name + " " + e3.name);
            else System.out.println("Low to high: " + e1.name + " " + e3.name + " " + e2.name);
        } else if (e2.salary < e3.salary && e2.salary < e1.salary) {
            if (e3.salary < e1.salary)
                System.out.println("Low to high: " + e2.name + " " + e3.name + " " + e1.name);
            else System.out.println("Low to high: " + e2.name + " " + e1.name + " " + e3.name);
        } else if (e3.salary < e1.salary && e3.salary < e2.salary) {
            if (e1.salary < e2.salary)
                System.out.println("Low to high: " + e3.name + " " + e1.name + " " + e2.name);
            else System.out.println("Low to high: " + e3.name + " " + e2.name + " " + e1.name);
        }
    }

        /**
         * Write a method to raise an employee's salary to three times of his/her original salary.
         * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
         * Do not change the input of this method.
         * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
         */
        public void tripleSalary (Employee employee){
            //write your code here
            employee.raiseSalary(300);
        }


        //Extra credit

        /**
         * I have written some code below. What I want is to swap two Employee objects.
         * One is Jenny and one is John. But after running it, I got the result below:
         * Before: a=Jenny
         * Before: b=John
         * After: a=Jenny
         * After: b=John
         * There is no change after swap()! Do you know the reason why my swap failed?
         * Write your understanding of the reason and explain it.
         */
    /*
     write your understanding here.

     My Answer: Because objects swaped were in swap function scope i.e. Employee x and Employee y,
    their reference values got swaped. But Employee object a and b are  defined outside of swap function and
    only their reference values were passed into swap function, not the actual employee objects.
     Basically, it is passed by value and therefore the original reference does not changed here.

    */
        public static void main (String[]args){
            Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
            Employee b = new Employee("John", 30, Gender.MALE, 2500);
            System.out.println("Before: a=" + a.getName());
            System.out.println("Before: b=" + b.getName());
            swap(a, b);//
            System.out.println("After: a=" + a.getName());
            System.out.println("After: b=" + b.getName());

            Assignment2 assignment = new Assignment2();
            Employee e1 = new Employee("Sita", 30, Gender.FEMALE, 2098);
            Employee e2 = new Employee("Mohan", 25, Gender.MALE, 1098);
            Employee e3 = new Employee("Babita", 30, Gender.FEMALE, 500);
            assignment.sortSalary(e1, e2, e3);

            System.out.println("\nInsurance covered on " +e1.name+ "is" +insuranceCoverage(e1));

            System.out.println("\nSocial security tax on " +e2.name+ "is" +insuranceCoverage(e2));



            assignment.tripleSalary(e3);
            System.out.println("\nNew raised salary of " +e3.name + " is " + e3.salary);




        }


        public static void swap (Employee x, Employee y){
            Employee temp = x;
            x = y;
            y = temp;

            // System.out.println("After: a=" + x.getName());
            //System.out.println("After: b=" + y.getName());

        }

    }