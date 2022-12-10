package Robot;

public class Robot {
    Drivetrain drivetrain;
    Intake intake;
    Shooter shooter;
    
    public Robot(Drivetrain drivetrain, Intake intake, Shooter shooter) {
        this.drivetrain = drivetrain;
        this.intake = intake;
        this.shooter = shooter;
    }
}
