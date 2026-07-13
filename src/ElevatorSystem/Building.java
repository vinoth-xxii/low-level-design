package ElevatorSystem;

public abstract class Building {
    private int floors_count;


    public int getFloors_count(){
        return floors_count;
    }

    //when the building extends we can set the count

    public void setFloors_count(int count) {
        floors_count = count;
    }


}
