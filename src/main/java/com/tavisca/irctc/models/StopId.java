package com.tavisca.irctc.models;

import java.io.Serializable;

public class StopId implements Serializable {
    private int trainId;
    private int id;

    public StopId(){}

    public StopId(int trainId, int id) {
        this.trainId = trainId;
        this.id = id;
    }
}
