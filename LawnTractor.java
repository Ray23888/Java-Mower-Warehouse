/*
Rachel White
03/24/2024
Comp167; section 003
I am creating a code for LawnTractor extends to Mower. I will create
methods of engine, model, and deckwidth

*/

public class LawnTractor extends Mower {
    private Engine engine;
    private String model;
    private double deckWidth;

    public LawnTractor() {// Default constructor with default values
        //constructor
        this.engine = engine;
        this.model = model;
        this.deckWidth = deckWidth;
        setMyType(" L");// I changed the type
    }
    //Getter and setters for engine, model, and deckwidth

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setModel(String model) {
        this.model = model;

    }

    public String getModel() {
        return model;
    }

    public void setDeckWidth(double deckWidth) {
        this.deckWidth = deckWidth;
    }

    public double getDeckWidth() {
        return deckWidth;
    }


    public String toString() {
        // I called the supertoString method to get the common mower attributes,
        // then add attributes of the lawn tractor.
        return super.toString() + "\n" + engine.toString() + "\n" + model + "\n" + deckWidth;
    }
}