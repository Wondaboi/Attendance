package com.Attendance.Factories;

import com.Attendance.Domain.EmployeePosition;

import java.util.Map;

public class EmployeePositionFactory {

    public static EmployeePosition getEmployeePosition(Map<String, String> values, int empNr, int depNr){

        return new EmployeePosition.Builder()
                .positionCode(values.get("positionCode"))
                .build();
    }
}
