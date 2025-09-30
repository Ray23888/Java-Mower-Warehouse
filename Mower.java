/*
Rachel White
03/24/2024
Comp167; section 003
I am creating a code that extends to Mower that will give the manfacturer, year, serial number and
the type which would be a hashtag.
*/
public abstract class Mower {
    private String manufacturer;
    private int year;
    private String serialNumber;
    private String myType = "#"; // I created type to default initialized to "#"

    public Mower() {
        setMyType("#"); //In the default constructor it sets the default type.


    }
    public Mower(String manufacturer, int year, String serialNumber){
        this.manufacturer = manufacturer;
        this.year = year;
        this.serialNumber = serialNumber;

    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;

    }
    //Setter and getters for manufacturer, year, serial number, and type

    public String getManufacturer(){
        return manufacturer;
    }
    public void setYear(int year){
        this.year = year;

    }

    public int getYear(){
        return year;
    }
    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;

    }
    public String getSerialNumber(){
        return serialNumber;
    }
    public void setMyType(String myType){
        this.myType = myType;

    }

    public String getMyType(){
        return myType;
    }


    public String toString(){
        return  manufacturer + "\n" + year +
                "\n" + serialNumber + "\n" + myType;
    }//This format the mower class attributes into a string I included type for #

}
