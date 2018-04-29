package com.Attendance.Repositories;

import com.Attendance.Domain.EmployeeContact;

public interface EmployeeContactRepository {
    EmployeeContact create(EmployeeContact employeeContact);
    EmployeeContact read(int id);
    EmployeeContact update(EmployeeContact employeeContact);
    void delete(int id);
}
