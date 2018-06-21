package com.example.sivakalapatapu.d;

import android.support.v4.util.TimeUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by siva kalapatapu on 6/30/2017.
 */

public class Resource {
    int type;
    int startTime;
    int endTime;

    ArrayList<Schedule> reservationSlots;

    Resource(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;

        /* Divide into intervals */
        int diff = endTime - startTime;
        int numOfIntervals = diff / 5;
    }


}