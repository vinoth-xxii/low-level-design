package ElevatorSystem;

public abstract  class Lift {
    int capacity;
    int direction;
    int current_floor;
    Set<Integer> stopsList;


    public void goUp(int floor){

    }

    public void goDown(int floor){

    }

    public abstract int getCapacity();

}
