package com.example.tidu.aswitch;

public class POJO2 {
    int image;
    String jobs,dollar,percent;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getDollar() {
        return dollar;
    }

    public void setDollar(String dollar) {
        this.dollar = dollar;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public POJO2(int image, String jobs, String dollar, String percent) {
        this.image = image;
        this.jobs = jobs;
        this.dollar = dollar;
        this.percent = percent;
    }
}
