package com.vortex.evaluacion.dto;

import com.vortex.evaluacion.models.Jobs;

public class JobsDTO {

    private int JOB_ID;
    private String JOB_TITLE;
    private int MIN_SALARY, MAX_SALARY;

    public JobsDTO(){}

    public JobsDTO(Jobs jobs){
        this.JOB_ID = jobs.getJOB_ID();
        this.JOB_TITLE = jobs.getJOB_TITLE();
        this.MIN_SALARY = jobs.getMIN_SALARY();
        this.MAX_SALARY = jobs.getMAX_SALARY();
    }

    public int getJOB_ID() {
        return JOB_ID;
    }

    public String getJOB_TITLE() {
        return JOB_TITLE;
    }

    public int getMIN_SALARY() {
        return MIN_SALARY;
    }

    public int getMAX_SALARY() {
        return MAX_SALARY;
    }
}
