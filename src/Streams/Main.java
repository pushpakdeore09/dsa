package Streams;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = EmployeeDatabase.getAllEmployees();


        List<String> res = employees.stream()
                        .map(Employee::getDept)
                        .distinct()
                        .toList();
        System.out.println(res);
    }
}
