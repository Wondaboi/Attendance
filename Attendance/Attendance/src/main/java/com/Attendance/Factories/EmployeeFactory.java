package com.Attendance.Factories;

import com.Attendance.Domain.Employee;

import java.util.Map;

public class EmployeeFactory {

    public static Employee getEmployee(Map<String, String> values, String empNr){

        Employee employee = new Employee.Builder()
                .employeeNumber(empNr)
                .build();
        return employee;
    }
}
