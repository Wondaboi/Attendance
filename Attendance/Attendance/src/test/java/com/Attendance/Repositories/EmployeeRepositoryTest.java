package com.Attendance.Repositories;

import com.Attendance.Domain.Employee;
import com.Attendance.Factories.EmployeeFactory;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRepositoryTest extends TestCase {
    Map<String, String> values;
    EmployeeRepository repository;

    public void setUp() throws Exception {
        repository = EmployeeRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("employeeNumber", "123");
        super.setUp();
    }

    public void testCreate() throws Exception {
        Employee employee = EmployeeFactory.getEmployee(values, "Valid");
        repository.create(employee);
        assertEquals("Valid", employee.getStatus());
    }

    public void testRead() throws Exception {
    }

    public void testUpdate() throws Exception {
    }

    public void testDelete() throws Exception {
    }

}