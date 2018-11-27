
package testproject;

import java.time.LocalDate;


public class Employee extends Person{
    
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(double salary, String name, String lastname, int age) {
        super(name, lastname, age);
        this.salary = salary;
    }

    @Override
    public int age(LocalDate birthDate, LocalDate currentDate) {
        return super.age(birthDate, currentDate); //To change body of generated methods, choose Tools | Templates.
    }
    
   
   
    
   
}
