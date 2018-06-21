package com.example.sivakalapatapu.d;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by siva kalapatapu on 6/30/2017.
 */

public class ResourceManager {
    ArrayList<Resource> resources;

    Resource AddResource(int type, int startTime, int endTime) {
       //resource newResource = new ThreadMillResource();
        //resources.add(newResource);
        return new Resource(startTime, endTime);
    }

    void DelResource(Resource resource) {
        //ArrayList<Resource> resourceArrayList = ResourcesByType.get(resource.type);

    }

    public int fitInSchedule(Schedule schedule, TimeTable timeTable) {

        return 0;
    }

}