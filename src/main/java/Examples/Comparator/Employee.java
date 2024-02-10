package Examples.Comparator;

public class Employee {
    protected String name;
    protected int age;
    protected double salary;

Employee(String name, int age, double salary){
    this.name = name;
    this.age = age;
    this.salary = salary;
}

    @Override
    public String toString() {
        return String.format("\nName: %s, Age: %s\n Salary: %s\n", name, age, salary);
    }
}
