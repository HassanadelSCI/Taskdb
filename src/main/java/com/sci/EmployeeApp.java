package com.sci;

import com.sci.dao.*;
import com.sci.models.Department;
import com.sci.models.Employee;
import com.sci.models.JobHistory;
import com.sci.models.Jobs;


import java.util.List;


public class EmployeeApp {
    public static void main(String[] args) {


//        DBJOBS jobHistory=new DBJOBS();
//        List<Jobs> jobHistories=jobHistory.get();
//        Jobs j1= jobHistories.get(2);
//        System.out.println(j1);
//        System.out.println(j1.getEmployees());


//        DBEmployee dbEmployee = new DBEmployee();
//        List<Employee> employeeList = dbEmployee.get();
//        Employee e1=employeeList.get(3);
//        System.out.println(e1);
//
//        System.out.println(e1.getEmployee());
//        System.out.println(e1.getManagerId());



//        for (Employee e : employeeList) {
//            System.out.println(e);
//        }


//        DBDepartment dbDepartment = new DBDepartment();
//
//        List<Department> departmentList = dbDepartment.get();
//
//        Department d1=departmentList.get(17);
//        System.out.println(d1.getDepartmentName());
//        System.out.println(d1.getManger());
//        System.out.println(d1.getEmployees().get(0));

        DBConfig.shutdown();

    }
}
