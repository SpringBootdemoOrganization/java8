package com.zhihao.Collectors;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsTest2 {
    public static void main(String[] args) {
        Employee employee = new Employee("zhangsan",4000,"市场部");
        Employee employee2 = new Employee("lisi",7000,"设计部");
        Employee employee3 = new Employee("wangwu",5433,"创意部");
        Employee employee4 = new Employee("zhaoliu",4000,"市场部");
        Employee employee5 = new Employee("wangfei",3222,"设计部");
        Employee employee6 = new Employee("tom",9000,"创意部");

        //计算员工的薪水
        List<Employee> employees = Arrays.asList(employee,employee2,employee3,employee4,employee5,employee6);
        int total = employees.stream().collect(Collectors.summingInt(Employee::getSalary));
        System.out.println(total);

        System.out.println("............................");

        //每个部门的员工，key是部门，value是员工的List
        Map<String,List<Employee>> byDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(byDept);

        System.out.println("............................");

        //计算每个部门的额薪水总和
        Map<String,Integer> totalByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.summingInt(Employee::getSalary)));
        System.out.println(totalByDept);

        System.out.println("............................");

        Map<Boolean,List<Employee>> passingFailing = employees.stream().collect(Collectors.
                partitioningBy(emp -> emp.getSalary() >4000));
        System.out.println(passingFailing);


    }
}
