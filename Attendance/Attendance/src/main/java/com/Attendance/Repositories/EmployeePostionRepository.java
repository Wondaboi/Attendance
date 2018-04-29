package com.Attendance.Repositories;

import com.Attendance.Domain.EmployeePosition;

public interface EmployeePostionRepository {
    EmployeePosition create(EmployeePosition employeePosition);
    EmployeePosition read(int id);
    EmployeePosition update(EmployeePosition employeePosition);
    void delete(int id);
}
