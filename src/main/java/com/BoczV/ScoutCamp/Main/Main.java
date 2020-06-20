package com.BoczV.ScoutCamp.Main;

import com.BoczV.ScoutCamp.Camp.Camp;
import com.BoczV.ScoutCamp.Groups.BoyGroup;
import com.BoczV.ScoutCamp.Groups.GirlGroup;

public class Main {
    public static void main(String[] args) {
        Camp camp = new Camp();
        for(int i = 0; i < 3; i++){
            camp.addGroup(new GirlGroup());
            camp.addGroup(new BoyGroup());
        }
        camp.workTenDaysInCamp();
    }
}
