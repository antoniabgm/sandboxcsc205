package sandbox.inheritance.vehicle;

public class Car extends LandCraft {

    @Override
    public void accelerate() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("engineStarted=").append(engineStarted);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void run() {

    }
}
