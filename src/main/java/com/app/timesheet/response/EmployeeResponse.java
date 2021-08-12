package com.app.timesheet.response;

import com.app.timesheet.entity.Employee;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeResponse implements Serializable {

    private Integer id;

    public EmployeeResponse(Integer id) {
        this.id = id;
    }

    public EmployeeResponse(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeResponse)) return false;
        EmployeeResponse that = (EmployeeResponse) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

