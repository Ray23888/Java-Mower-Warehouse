/*
Rachel White
03/24/2024
Comp167; section 003
I am creating a code for GasPoweredMower extends to WalkBehindMower. I will create
methods of engine and the boolean isSelfPropelled

*/
public class GasPoweredMower extends WalkBehindMower{
    private Engine engine;
    private boolean isSelfPropelled;

    GasPoweredMower(){
        super();// Calls on past attributes
        setMyType("G");// Default value for type status

    }
    //getter and setter for engine that comes from engine and boolean isSelfPropelled
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public Engine getEngine() {
        return engine;
    }
    public void setSelfPropelled(boolean selfPropelled) {
        isSelfPropelled = selfPropelled;
    }
    public boolean isSelfPropelled() {
        return isSelfPropelled;
    }
    public String toString() {
        // I called the super toString method to get the WalkBehindMower attributes,
        // then add the specific attributes of the gas-powered mower.
        return super.toString() + "\n" + engine.toString() + "\n" + isSelfPropelled;
    }
}
