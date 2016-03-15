package com.jpmc.anil.mybatis.service;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Employee<T> implements Serializable {

    private T          id;
    private String     email;
    private String     phoneNumber;
    private Date       hireDate;
    private String     jobId;
    private BigDecimal salary;
    private BigDecimal commission;
    private Long       managerId;
    private Long       deptId;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", email=" + email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", jobId=" + jobId + ", salary=" + salary + ", commission=" + commission + ", managerId=" + managerId + ", deptId=" + deptId + "]";
    }

}
