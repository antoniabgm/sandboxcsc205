package sandbox.inheritance.vehicle;

public class Truck extends LandCraft {

    @Override
    public void transport() {
        System.out.println("transporting truck stuff");
    }

    @Override
    public void accelerate() {
        System.out.println("truck is accelerating");
    }

    public void horn() {
        System.out.println("truck is honking");
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
