package com.Attendance.Repositories;

import com.Attendance.Domain.EmployeeClockInOut;

public interface EmployeeClockInOutRepository {
    EmployeeClockInOut create(EmployeeClockInOut employeeClockInOut);
    EmployeeClockInOut read(int id);
    EmployeeClockInOut update(EmployeeClockInOut employeeClockInOut);
    void delete(int id);
}
