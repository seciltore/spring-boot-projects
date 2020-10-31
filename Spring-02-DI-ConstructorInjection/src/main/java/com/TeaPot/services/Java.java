package com.TeaPot.services;

import com.TeaPot.interfaces.Courses;
import com.TeaPot.interfaces.ExtraSessions;

public class Java implements Courses {

    public int x;

    //OfficeHours officeHours;

    ExtraSessions extraSessions;

    //Always do injections through interfaces to make loosely coupled

  public Java(ExtraSessions extraSessions){
      this.extraSessions = extraSessions;
  }

    @Override
    public void getTeachingHours() {
        System.out.println("Teaching hours : " + (20 + extraSessions.getHours()));
    }
}
