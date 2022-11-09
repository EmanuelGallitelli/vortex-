package com.vortex.evaluacion.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private int JOB_ID;
    private String JOB_TITLE;
    private int MIN_SALARY, MAX_SALARY;

    public Jobs(){}

    public Jobs(int JOB_ID, String JOB_TITLE, int MIN_SALARY, int MAX_SALARY) {
        this.JOB_ID = JOB_ID;
        this.JOB_TITLE = JOB_TITLE;
        this.MIN_SALARY = MIN_SALARY;
        this.MAX_SALARY = MAX_SALARY;
    }

    public int getJOB_ID() {
        return JOB_ID;
    }

    public String getJOB_TITLE() {
        return JOB_TITLE;
    }

    public void setJOB_TITLE(String JOB_TITLE) {
        this.JOB_TITLE = JOB_TITLE;
    }

    public int getMIN_SALARY() {
        return MIN_SALARY;
    }

    public void setMIN_SALARY(int MIN_SALARY) {
        this.MIN_SALARY = MIN_SALARY;
    }

    public int getMAX_SALARY() {
        return MAX_SALARY;
    }

    public void setMAX_SALARY(int MAX_SALARY) {
        this.MAX_SALARY = MAX_SALARY;
    }
}
