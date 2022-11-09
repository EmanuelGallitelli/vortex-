package com.vortex.evaluacion.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Job_History {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int EMPLOYEE_ID;
    private LocalDateTime START_DATE, END_DATE;

    public Job_History(){}

    public Job_History(int EMPLOYEE_ID, LocalDateTime START_DATE, LocalDateTime END_DATE) {
        this.EMPLOYEE_ID = EMPLOYEE_ID;
        this.START_DATE = START_DATE;
        this.END_DATE = END_DATE;
    }

    public int getEMPLOYEE_ID() {
        return EMPLOYEE_ID;
    }

    public LocalDateTime getSTART_DATE() {
        return START_DATE;
    }

    public void setSTART_DATE(LocalDateTime START_DATE) {
        this.START_DATE = START_DATE;
    }

    public LocalDateTime getEND_DATE() {
        return END_DATE;
    }

    public void setEND_DATE(LocalDateTime END_DATE) {
        this.END_DATE = END_DATE;
    }
}
