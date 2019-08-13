package com.bean;

public class MyService implements Service {

    public Job job;

    public void setJob(Job job) {
        this.job=job;
        System.out.println("Hello from Myservice: Job ID="+job);
    }

    public Job getJob() {
        return job;
    }
}
