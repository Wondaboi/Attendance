package com.Attendance.Repositories;


public class EmployeeRepositoryImpl {
    private static EmployeeRepository instance;

    public static EmployeeRepository getInstance() {
        return instance;
    }
}
