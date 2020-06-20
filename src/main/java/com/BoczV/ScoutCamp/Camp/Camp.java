package com.BoczV.ScoutCamp.Camp;

import com.BoczV.ScoutCamp.Groups.ScoutGroup;

import java.util.HashSet;
import java.util.Set;

public class Camp {
    private Set<ScoutGroup> groups = new HashSet<ScoutGroup>();
    private boolean hasFire = false;
    private int numberOfStructures = 0;


    public void addGroup(ScoutGroup group) {
        groups.add(group);
    }

    public void workTenDaysInCamp(){
        for(int i = 0; i < 10; i++){
            ScoutGroup winnerGroup = null;
            for(ScoutGroup group: groups){
                winnerGroup = checkWhoIsWinner(group, winnerGroup);
            }
            System.out.println(winnerGroup + " will light fire!");
            hasFire = false;
        }
        System.out.println("We built " + numberOfStructures + " structures in this 10 days!");
    }

    private ScoutGroup checkWhoIsWinner(ScoutGroup group, ScoutGroup winnerGroup){
        boolean builtStructure = group.buildStructure();
        if(builtStructure){
            numberOfStructures += 1;
            if(winnerGroup == null) {
                winnerGroup = group;
                hasFire = group.setFire();
            }
        }
        return winnerGroup;
    }
}
