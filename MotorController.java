package Robot;

public class MotorController {
    double speed;
    int port;
    public MotorController (int port){
        this.port = port;
        this.speed = 0;
    }
}
