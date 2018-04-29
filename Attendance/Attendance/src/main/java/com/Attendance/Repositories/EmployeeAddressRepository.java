package com.Attendance.Repositories;

import com.Attendance.Domain.EmployeeAddress;

public interface EmployeeAddressRepository {
    EmployeeAddress create(EmployeeAddress employeeAddress);
    EmployeeAddress read(int id);
    EmployeeAddress update(EmployeeAddress employeeAddress);
    void delete(int id);
}
