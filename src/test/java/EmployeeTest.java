import com.example.demo.Employee;

import java.io.*;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee empOne=new Employee("张三");
        Employee empTwo= new Employee("李四");
        empOne.emaAge(25);
        empOne.empDesignation("java");
        empOne.empSalary(11111111);
        empOne.print();

        empTwo.emaAge(33);
        empTwo.empSalary(222222);
        empTwo.empDesignation("java");
        empTwo.print();
    }
}
