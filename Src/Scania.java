import java.awt.*;
import java.awt.geom.Point2D;

public class Scania extends Truck{
    public double bedAngle; // The angle of the loading platform
    public Scania(Point2D.Double position){
        super(position);
        nrDoors = 2;
        color = Color.black;
        enginePower = 90;
        modelName = "Scania";
        stopEngine();
    }
    public void lowerBed(double angle){
        if (currentSpeed == 0) {
            bedAngle = limitTo(bedAngle - angle, 0, 70);
        }
    }
    public void raiseBed(double angle){
        if (currentSpeed == 0) {
            bedAngle = limitTo(bedAngle + angle, 0, 70);
        }
    }
    public double speedFactor(){
        if (bedAngle == 0){
            return 0.01 * enginePower;
        }
        else{
            return 0.0;
        }
    }

    @Override
    public void startEngine(){
        if (bedAngle == 0){
            super.startEngine();
        }
    }
}
