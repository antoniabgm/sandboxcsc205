package sandbox.inheritance.vehicle;

public abstract class Vehicle implements Conveyance, Runnable{

    public static int counter = 0;

    protected boolean engineStarted = false;

    // default constructor
    public Vehicle() {
        counter++;
    }

    public void startEngine() {
        System.out.println(this.getClass().getSimpleName() + " engine started");
        engineStarted = true;
    }

    public void stopEngine() {
        System.out.println(this.getClass().getSimpleName() + " engine stopped");
        engineStarted = false;
    }
}

// understand the diff between abstract class and interface