package com.bean;

public class MyJob implements Job {
    public String myJob;

    public MyJob() {
    	myJob="Not Joined";
    	System.out.println("From MyJob default Constructor and the ID= "+this.getMyJob());
    }

    public void setMyJob(String myJob) {
        this.myJob=myJob;
    }

    public String getMyJob() {
        return myJob;
    }
    public String toString() {
    	return myJob;
    }
}