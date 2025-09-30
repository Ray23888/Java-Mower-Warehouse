/*
Rachel White
03/24/2024
Comp167; section 003
I am creating a code for the Engine class. I will create
methods of manufacturer, hoursePower, and cylinders with no type.

*/
public class Engine {
    private String manufacturer;
    private double hoursePower;
    private int cylinders;

    public Engine() {
        manufacturer = "NA"; // I created a default manufacturer
        hoursePower = -1.0;//I created a default horsepower
        cylinders = -1;//I created a default number of cylinders
    }

    public Engine(String manufacturer, double horsePower, int cylinders) {
        this.manufacturer = manufacturer;
        this.hoursePower = horsePower;
        this.cylinders = cylinders;
    }
    //The getter and setter manufacturer, hoursePower, and cylinders
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getManufacturer() {
        return manufacturer;
    }

    public void setHoursePower(double hoursePower) {
        this.hoursePower = hoursePower;
    }
    public double getHoursePower() {
        return hoursePower;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
    public int getCylinders() {
        return cylinders;
    }




    public String toString(){ //Created a toString to come back to the attributes
        return manufacturer + "\n" + hoursePower + "\n" + cylinders;
    }

}
