package com.mehmetaltindal.startrekbook;

import java.io.Serializable;

public class USSEnterpriseCrew implements Serializable {

    private String name;
    private String job;
    private int pictureId;

    public USSEnterpriseCrew(String name, String job, int pictureId) {
        this.name = name;
        this.job = job;
        this.pictureId = pictureId;
    }


    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getPictureId() {
        return pictureId;
    }
}
