public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    double tax(){
        if(this.salary > 1000){
            return salary * 0.03;
        }
        return 0;
    }

    double bonus(){
        if(this.workHours > 40){
            int extraHours = this.workHours - 40;
            return (extraHours * 30);
        }
        return 0;
    }

    double raise(){
        int years = 2021 - this.hireYear;
        if(years > 19){
            return this.salary * 0.15;
        }
        else if(years > 9) {
            return this.salary * 0.1;
        }
        else {
            return this.salary * 0.05;
        }
    }

    double netSalary(){
        return this.salary - this.tax() + this.bonus() + this.raise();
    }

    @Override
    public String toString() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hiring Date: " + this.hireYear);
        System.out.println("Tax: " + this.tax());
        System.out.println("Bonus: " + this.bonus());
        System.out.println("Raise: " + this.raise());
        System.out.println("Net Salary: " + this.netSalary());
        return null;
    }
}
