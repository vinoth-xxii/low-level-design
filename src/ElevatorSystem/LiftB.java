package ElevatorSystem;

public class LiftB extends Lift{

    public void ListB(int capacity){
        lift_capacity = capacity;
    }

    @Override
    public int getCapacity() {
        return lift_capacity;
    }
}
