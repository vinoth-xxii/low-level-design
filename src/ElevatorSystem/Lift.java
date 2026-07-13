package ElevatorSystem;

public abstract  class Lift {
    int direction;
    int current_floor;
    Set<Integer> stopsList;


    public void goUp(int floor){
        current_floor++;
    }

    public void goDown(int floor){
        current_floor--;
    }

}
