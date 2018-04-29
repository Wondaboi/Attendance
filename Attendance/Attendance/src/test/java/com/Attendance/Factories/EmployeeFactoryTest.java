package com.Attendance.Factories;

import com.Attendance.Domain.Employee;
import junit.framework.TestCase;

import  com.Attendance.Domain.Employee;
import java.util.HashMap;
import java.util.Map;

public class EmployeeFactoryTest extends TestCase {
    public void setUp() throws Exception {
        HashMap<String, String> values = new HashMap<String, String>();
        String employeeNumber = values.put("employeeNumber", "123");
        super.setUp();
    }

    public void testGetEmployee() throws Exception {
        Map<String, String> values = null;
        Employee emp = EmployeeFactory.getEmployee(values, "123");
        System.out.println(emp.getEmployeeNumber());
    }

}