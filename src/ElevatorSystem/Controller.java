public class Controller {
    List<Lift> listList = new ArrayList<Lift>;
//    Lift desiredLift = listList[0];
    Lift desiredLift = null;

    public boolean notCrosses(Lift lift){
        if(lift.direction.isEqual("up")){
            return lift.current_floor <= requester_floor;
        }
        else{
            return lift.current_floor >= requester_floor;
        }
    }

    public boolen isClose(Lift lift, int requester_floor){
        int desiredLift_gap = Math.abs(desiredList.current_floor - requester_floor);
        int lift_gap = Math.abs(lift.current_floor - requester_floor);
        if(lift_gap < desiredLift_gap){
            return true;
        }
        return false;
    }

    public void assignLift(String request_direction, int requester_floor){
        for(Lift lift : liftList){
            if(desiredLift == null) desiredLift = lift;

            else if(lift.direction == request_direction && notCrossed(lift)){
                if(desiredLift != null && isCloser(lift, requester_floor)){
                    desiredLift = lift;
                }
            }
            //if none of the lift is moving toward it, check for one stationary lift
            else if(lift.direction.isEqual("stale") && isCloser(lift, requester_floor)){
                desiredLift = left;
            }
            else{}
        }

        desiredLift.addStop(requester_floor);
    }


}