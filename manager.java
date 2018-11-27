
package testproject;

import java.time.LocalDate;


public class manager extends Person{
    
    private double bonus;
    
    public manager(String name, String lastname, int age) {
        super(name, lastname, age);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public manager(double bonus, String name, String lastname, int age) {
        super(name, lastname, age);
        this.bonus = bonus;
    }

    @Override
    public int age(LocalDate birthDate, LocalDate currentDate) {
        return super.age(birthDate, currentDate); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
