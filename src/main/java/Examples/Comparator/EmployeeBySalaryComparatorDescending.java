package Examples.Comparator;

import java.util.Comparator;

public class EmployeeBySalaryComparatorDescending implements Comparator<Employee> {
    @Override
    public int compare(Employee obj1, Employee obj2) {
        if (obj1.salary < obj2.salary)  return 1;
        else if (obj1.salary == obj2.salary) return 0;
        else return  -1;
    }
}
