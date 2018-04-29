package com.Attendance.Domain;


public class LateComing {
    private Employee employee;
    private java.sql.Time Time;
    private java.util.Date Date;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public java.sql.Time getTime() {
        return Time;
    }

    public void setTime(java.sql.Time time) {
        Time = time;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LateComing)) return false;

        LateComing that = (LateComing) o;

        if (employee != null ? !employee.equals(that.employee) : that.employee != null) return false;
        if (Time != null ? !Time.equals(that.Time) : that.Time != null) return false;
        return Date != null ? Date.equals(that.Date) : that.Date == null;
    }

    @Override
    public int hashCode() {
        int result = employee != null ? employee.hashCode() : 0;
        result = 31 * result + (Time != null ? Time.hashCode() : 0);
        result = 31 * result + (Date != null ? Date.hashCode() : 0);
        return result;
    }
}
