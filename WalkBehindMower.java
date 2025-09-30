/*
Rachel White
03/24/2024
Comp167; section 003
I am creating a code for WalkBehindMower that extends to Mower according to the UML.
I will create methods for cutWidth and wheelDiameter.

*/
abstract class WalkBehindMower extends Mower {
    private double cutWidth;
    private double wheelDiameter;

    public WalkBehindMower() {
        this.cutWidth = cutWidth;
        this.wheelDiameter = wheelDiameter;
    }
    //Setter and getter cutWidth and wheelDiameter
    public void setCutWidth(double cutWidth) {
        this.cutWidth = cutWidth;
    }
    public double getCutWidth() {
        return cutWidth;
    }

    public void setWheelDiameter(double wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }
    public double getWheelDiameter() {
        return wheelDiameter;
    }


    public String toString(){
        //Super to String to call on other attributes in different class and to add the current attributes
        return super.toString()+ "\n" + cutWidth + "\n" + wheelDiameter;
    }
}
