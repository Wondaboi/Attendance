package com.Attendance.Factories;

import com.Attendance.Domain.EmployeeClockInOut;

import java.sql.Time;
import java.util.Map;

public class EmployeeClockInOutFactory {

    public static EmployeeClockInOut getEmployeeClockInOut(Map<Time, Time> values){

        EmployeeClockInOut employeeClockInOut = new EmployeeClockInOut.Builder()
                .employeeClockIn(values.get("employeeClockIn"))
                .employeeClockOut(values.get("employeeClockOut"))
                .Date((values.get("Date")))
                .build();

        return employeeClockInOut;
    }
}
