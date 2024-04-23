package com.sci;

import com.sci.dao.*;
import com.sci.models.*;


import java.util.List;


public class EmployeeApp {
    public static void main(String[] args) {


        DBPerson dbPerson = new DBPerson();
        DBCar dbCar = new DBCar();


        //        Person person = new Person();
//        person.setName("Ahmed");
//        person.setId(1);
//        dbPerson.insert(person);
//        Person person2 = new Person();
//        person2.setName("Mohamed");
//        person2.setId(2);
//        dbPerson.insert(person2);
//
//
//        Car car1 = new Car();
//        car1.setId(1);
//        car1.setBrand("bmw");
//        car1.setPerson_id(1);
//        dbCar.insert(car1);


        //       dbPerson.delete(2);


        List<Car> cars = dbCar.get();
        for (Car c : cars) {
            System.out.println(c);
        }

        List<Person> persons = dbPerson.get();
        for (Person p : persons) {
            System.out.println(p);
        }


//        DBJOBS jobHistory = new DBJOBS();
//        List<Jobs> jobHistories = jobHistory.get();
//        Jobs j1 = jobHistories.get(2);
//        System.out.println(j1);
//        System.out.println(j1.getEmployees());

//
//        DBEmployee dbEmployee = new DBEmployee();
//        List<Employee> employeeList = dbEmployee.get();
//        Employee e1 = employeeList.get(3);
//        System.out.println(e1);
//
//        System.out.println(e1.getEmployee());
//        System.out.println(e1.getManagerId());
//
//
//        for (Employee e : employeeList) {
//            System.out.println(e);
//        }
//
//
//        DBDepartment dbDepartment = new DBDepartment();
//
//        List<Department> departmentList = dbDepartment.get();
//
//        Department d1 = departmentList.get(17);
//        System.out.println(d1.getDepartmentName());
//        System.out.println(d1.getManger());
//        System.out.println(d1.getEmployees().get(0));

        DBConfig.shutdown();

    }
}
