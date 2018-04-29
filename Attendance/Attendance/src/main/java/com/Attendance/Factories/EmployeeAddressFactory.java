package com.Attendance.Factories;

import com.Attendance.Domain.EmployeeAddress;

import java.util.Map;

public class EmployeeAddressFactory {

    public static EmployeeAddress getEmployeeAddress(Map<String, String> values){

        EmployeeAddress employeeAddress = new EmployeeAddress.Builder()
                .physicalAddress(values.get("physicalAddress"))
                .postalAddress(values.get("postalAddress"))
                .postalCode((values.get("postalCode")))
                .build();

        return employeeAddress;


    }
}
