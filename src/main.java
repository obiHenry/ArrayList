import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class main {

    public static  void main(String[] args){
        List<Employee> employeeList = new ArrayList<>();
        List<Employee> employeeList1 = new Vector<>();
        employeeList.add(new Employee("emma", "emeka", "1233" ));
        employeeList.add(new Employee("uchenna", "kinsely", "133" ));
        employeeList.add(new Employee("Favour", "obi", "3458" ));
        employeeList.add(new Employee("paul", "kamso", "3452" ));

//        employeeList.forEach(employee -> System.out.println(employee));
//        System.out.println(employeeList.get(1));
//        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("chimezie", "obi", "1231"));
//        employeeList.forEach(employee -> System.out.println(employee));

        employeeList.add(3, new Employee("uchenna", "kingsely", "133"));
//        employeeList.forEach(employee -> System.out.println(employee));
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for (Employee employee: employeeArray
             ) {
            System.out.println(employee);


        }

    System.out.println(employeeList.contains(new Employee("uchenna", "kingsely", "133")));
        System.out.println(employeeList.indexOf(new Employee("chimezie", "obi", "1231")));
    employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));


    }
}
