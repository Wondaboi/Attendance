package com.Attendance.Services;

import com.Attendance.Domain.EmployeePosition;

public interface EmployeePostionServices {
    EmployeePosition create(EmployeePosition employeePosition);
    EmployeePosition read(int id);
    EmployeePosition update(EmployeePosition employeePosition);
    void delete(int id);
}
