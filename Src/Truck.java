abstract class Truck extends MotorVehicle {
    protected double trailerAngle; // The angle of the loading platform
    protected boolean moving ; // If the truck is moving
    // Variables
    protected int nrDoors; // Number of doors on the car

    // Methods
    public int getNrDoors(){
        return nrDoors;
    }
    public void checkMoving(){
        if (currentSpeed != 0){
            moving = true;
        }
    }
    public void lowerLoadingPlatform(double angle){
        trailerAngle -= angle; // Can not be under 0
    }
    public void raiseLoadingPlatform(double angle){
        trailerAngle += angle; // Can not be over 70
    }
    public double speedFactor(){
        if (trailerAngle == 0){
            return 0.01 * enginePower;
        }
        else{
            return 0.0;
        }
    }

    public void loadingPlatform(){
        limitTo(trailerAngle, 0,70);
    }
}