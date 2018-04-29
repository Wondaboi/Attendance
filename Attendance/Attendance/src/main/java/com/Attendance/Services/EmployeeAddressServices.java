package com.Attendance.Services;

import com.Attendance.Domain.EmployeeAddress;

public interface EmployeeAddressServices {
    EmployeeAddress create(EmployeeAddress employeeAddress);
    EmployeeAddress read(int id);
    EmployeeAddress update(EmployeeAddress employeeAddress);
    void delete(int id);
}
