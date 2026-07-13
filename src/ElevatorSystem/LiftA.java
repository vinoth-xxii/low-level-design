package ElevatorSystem;

public class LiftA extends Lift{

    public void ListA(int capacity){
        lift_capacity = capacity;
    }

    @Override
    public int getCapacity() {
        return lift_capacity;
    }
}
