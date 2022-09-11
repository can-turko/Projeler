public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int year = 2022;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    int taxValue() {
        int tax;
        if (this.salary < 1000) {
            return tax=0;
        } else {
            tax = (int)(this.salary * 0.03);

            return tax;
        }
    }

    int bonusSalary() {
        int bonus;
        if (this.workHours > 40) {
            bonus = (workHours - 40) * 30;
            return bonus;
        } else return bonus = 0;
    }

    int raiseSalary() {
        int raise;
        if ((this.year - this.hireYear) < 10) {
            return raise = (int)(this.salary * 0.05);
        } else if ((this.year - this.hireYear) < 20 && (this.year - this.hireYear) > 9) {
            return raise = (int)(this.salary * 0.1);
        } else return raise = (int)(this.salary * 0.15);
    }

    public String toString(){
        int calculatedSalary = this.salary-taxValue()+bonusSalary()+raiseSalary();
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma saati: "+this.workHours);
        System.out.println("Başlangıç yılı: "+this.hireYear);
        System.out.println("Vergi: "+taxValue());
        System.out.println("Bonus: "+bonusSalary());
        System.out.println("Maaş artışı: "+raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş: "+(-taxValue()+this.salary+bonusSalary()));
        System.out.println("Toplam maaş: "+calculatedSalary);
        return null;
    }

}
