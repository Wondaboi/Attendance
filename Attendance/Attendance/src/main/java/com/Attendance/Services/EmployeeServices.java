package com.Attendance.Services;

import com.Attendance.Domain.Employee;

public interface EmployeeServices {
    Employee create(Employee employee);
    Employee read(int id);
    Employee update(Employee employee);
    void delete(int id);
}
