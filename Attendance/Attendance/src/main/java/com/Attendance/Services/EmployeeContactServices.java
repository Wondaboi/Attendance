package com.Attendance.Services;

import com.Attendance.Domain.EmployeeContact;

public interface EmployeeContactServices {
    EmployeeContact create(EmployeeContact employeeContact);
    EmployeeContact read(int id);
    EmployeeContact update(EmployeeContact employeeContact);
    void delete(int id);
}
