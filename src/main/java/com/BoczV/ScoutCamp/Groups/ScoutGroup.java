package com.BoczV.ScoutCamp.Groups;

import java.util.Random;

public abstract class ScoutGroup {
    protected int numberOfMembers;
    protected static Random random = new Random();
    protected int lengthOfRope = 400;
    protected int decreaseLengthOfRopeByTrying = 10;
    protected int decreaseLengthOfRopeByBuilding = 20;
    protected int chanceOfFindingWood;
    protected int chanceOfBuilding;
    protected int chanceOfRaiseFire;


    public ScoutGroup(){
        numberOfMembers = 4 + random.nextInt(5);
    }

    protected boolean searchForWood(){
        for(int i = 0; i < 4; i++){
            int randomNumber = 1 + random.nextInt(101);
            if(randomNumber <= chanceOfFindingWood){
                return true;
            }
        }
        return false;
    }

    public boolean buildStructure(){
        if(searchForWood()){
            int randomNumber = 1 + random.nextInt(101);
            if(randomNumber <= chanceOfBuilding){
                lengthOfRope -= decreaseLengthOfRopeByBuilding;
                return true;
            }
            lengthOfRope -= decreaseLengthOfRopeByTrying;
            return false;
        }
        return false;
    }

    public boolean setFire(){
        int randomNumber = 1 + random.nextInt(101);
        while (randomNumber <= chanceOfRaiseFire){
            randomNumber = 1 + random.nextInt(101);
        }
        return true;
    }
}
