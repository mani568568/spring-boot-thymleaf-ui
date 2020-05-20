//package com.m.g.ui.test;
//
//import com.m.g.ui.jpa.model.EmployeeEntity;
//import com.m.g.ui.service.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//
//@Component
//public class TestEmployee {
//
//    @Autowired
//    EmployeeService employeeService;
//
//    @PostConstruct
//    public void createData()
//    {
//        EmployeeEntity employeeEntity = new EmployeeEntity();
//        employeeEntity.setEmployeeId("001");
//        employeeEntity.setEmployeeName("Mani");
//        employeeEntity.setEmployeeEmail("m@m.com");
//        employeeEntity.setEmployeeAddress("ACHNT");
//        employeeService.saveEmployee(employeeEntity);
//        System.out.println("Successfully saved employee details");
//    }
//}
