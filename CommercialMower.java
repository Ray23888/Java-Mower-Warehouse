/*
Rachel White
03/24/2024
Comp167; section 003
I am creating a code for CommercialMower extends LawnTractor. I will create
methods of operatingHours and zeroTurnRadius while changing type to C

*/
public class CommercialMower extends LawnTractor {
    private double operatingHours;
    private boolean zeroTurnRadius;

    public CommercialMower() {
        //constructor
        this.operatingHours = operatingHours;
        this.zeroTurnRadius = zeroTurnRadius;
        setMyType("C");// I set the type of mower to "C"
    }
    // Setters and getters for operatingHours and zeroTurnRadius

    public void setOperatingHours(double operatingHours) {
        this.operatingHours = operatingHours;
    }
    public double getOperatingHours() {
        return operatingHours;
    }
    public void setZeroTurnRadius(boolean zeroTurnRadius) {
        this.zeroTurnRadius = zeroTurnRadius;
    }

    public boolean isZeroTurnRadius() {
        return zeroTurnRadius;
    }


    public String toString(){
        // Call the super toString method to get the common mower attributes,
        // then append the specific attributes of the commercial mower.
        return super.toString().replace("L","C") + "\n" + operatingHours + "\n" + zeroTurnRadius;
    }
}


