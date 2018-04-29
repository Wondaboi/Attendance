package com.Attendance.Domain;

import java.io.Serializable;

public class EmployeePosition implements Serializable {
    private String positionCode;

    public EmployeePosition(Builder builder) {
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeePosition)) return false;

        EmployeePosition that = (EmployeePosition) o;

        return positionCode != null ? positionCode.equals(that.positionCode) : that.positionCode == null;
    }

    @Override
    public int hashCode() {
        return positionCode != null ? positionCode.hashCode() : 0;
    }

    public static class Builder {
        String positionCode;

        public Builder positionCode(String value){
            this.positionCode = value;
            return this;
        }
        public EmployeePosition build(){
            return new EmployeePosition((this));
        }
    }

}
