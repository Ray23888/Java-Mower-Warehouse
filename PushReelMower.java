///*
//Rachel White
//03/24/2024
//Comp167; section 003
//I am creating a code for PushReelMower that extends WalkBehindMower. Creating
//getter and setters for numWheels
//
//*/
public class PushReelMower extends WalkBehindMower {
    private int numWheels;

    public PushReelMower() {
        setMyType("P"); //  I set the type of mower to "P" for Push Reel

    }
    //Getter and setter for numWheels

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public String toString() {// Call the super toString method to get the other mower attributes,
        // then add attributes of the push reel mower.
        return super.toString() + "\n" + numWheels;
    }
}
