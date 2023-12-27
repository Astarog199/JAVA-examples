package HomeWorkForSeminar_3;

import java.util.Comparator;

/**
 * Сортировка по убыванию возраста
 */

public class EmployeeByAgeComparatorDescending implements Comparator<Employee> {
    @Override
    public int compare(Employee obj1, Employee obj2) {
        if (obj1.age < obj2.age)  return 1;
        else if (obj1.age == obj2.age) return 0;
        else return  -1;
    }
}
