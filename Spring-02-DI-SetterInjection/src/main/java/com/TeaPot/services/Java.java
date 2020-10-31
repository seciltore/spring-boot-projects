package com.TeaPot.services;

import com.TeaPot.interfaces.Courses;
import com.TeaPot.interfaces.ExtraSessions;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
//@Data includes getter, setter, constructor
public class Java implements Courses {

    private ExtraSessions extraSessions;

    /*
    public OfficeHours getOfficeHours(){
        return officeHours;
    }

    public void setOfficeHours(OfficeHours officeHours) {   //set+officeHours -> spring removes set from the name on the config.xml
        this.officeHours = officeHours;
    }
     */

    @Override
    public void getTeachingHours() {
        System.out.println("Teaching hours : " + (20 + extraSessions.getHours()));
    }
}
