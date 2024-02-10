package HomeWork.HomeWorkForSeminar_3;

import java.util.Comparator;

public class EmployeeByNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee obj1, Employee obj2) {
//        if(obj1.name.startsWith("Константин") && !obj2.name.startsWith("Константин")){
//            return -1;
//        } else if(!obj1.name.startsWith("Константин") && obj2.name.startsWith("Константин")){
//            return 1;
//        }
        return obj1.name.compareTo(obj2.name);
    }
}
