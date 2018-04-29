package com.Attendance.Services;

import com.Attendance.Domain.EmployeeClockInOut;

public interface EmployeeClockInOutService {
    EmployeeClockInOut create(EmployeeClockInOut employeeClockInOut);
    EmployeeClockInOut read(int id);
    EmployeeClockInOut update(EmployeeClockInOut employeeClockInOut);
    void delete(int id);
}
