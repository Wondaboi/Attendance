package com.Attendance.Factories;

import com.Attendance.Domain.EmployeeContact;

import java.util.Map;

public class EmployeeContactFactory {

    public static EmployeeContact getEmployeeContact(Map<String, String> values){

        EmployeeContact employeeContact = new EmployeeContact.Builder()
                .cellNumber(values.get("cellNumber"))
                .homeNumber(values.get("homeNumber"))
                .build();

        return employeeContact;


    }
}
