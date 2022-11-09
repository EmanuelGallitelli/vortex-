package com.vortex.evaluacion.dto;

import com.vortex.evaluacion.models.Job_History;

import java.time.LocalDateTime;

public class Job_HistoryDTO {
    private int EMPLOYEE_ID;
    private LocalDateTime START_DATE, END_DATE;

    public Job_HistoryDTO(){}

    public Job_HistoryDTO(Job_History job_history){
        this.EMPLOYEE_ID = job_history.getEMPLOYEE_ID();
        this.START_DATE = job_history.getSTART_DATE();
        this.END_DATE = job_history.getEND_DATE();
    }

}
