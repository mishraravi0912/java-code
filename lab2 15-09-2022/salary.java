/*
 * Write a java program to find out below problem, in a small company, 
the average salary of three employees is Rs10000 per week. 
If one employee earns Rs11000 and other earns Rs5000, how much will the third employee earn?
 */
public class salary {
    public static void main(String[] args) {

        int average_salary = 10000;
        int employee1 = 11000;
        int employee2 = 5000;

        double employee3;

        employee3 = (average_salary * 3) - (employee1 + employee2);
        System.out.println("Salary of third employee is " + employee3);
    }
}