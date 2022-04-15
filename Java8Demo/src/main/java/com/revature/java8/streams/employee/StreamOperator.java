package com.revature.java8.streams.employee;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperator {
    private static Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100000.0), 
            new Employee(2, "Bill Gates", 200000.0), 
            new Employee(3, "Mark Zuckerberg", 300000.0)
        };
    
    public static void main(String[] args) {
        Stream<Employee> empStream=Stream.of(arrayOfEmps);
    //    empStream.forEach(e->System.out.println(e));
        
    //    empStream.filter((emp)->emp.getName().startsWith("B")).forEach(System.out::println);
        
        //empStream.filter((emp)->emp.getSalary()>100000).forEach(System.out::println);
        
    List<Employee> empList=    empStream.filter((emp)->emp.getSalary()>100000).collect(Collectors.toList());
    System.out.println(empList);
        
    
        
    }
}