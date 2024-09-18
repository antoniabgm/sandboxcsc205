package sandbox.inheritance.vehicle;

public abstract class LandCraft extends Vehicle {

    @Override
    public void transport() {
        System.out.println("transporting land stuff");
    }

    public abstract void accelerate();
}
