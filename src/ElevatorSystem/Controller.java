public class Controller {
    List<Lift> listList = new ArrayList<Lift>;
    Lift desiredLift = listList[0];

    public void assignLift(String request_direction, int request_floor){
        for(List lift : listList){
            if(request_direction == 'up'){
                if(lift.direction == request_direction && lift.current_floor >= request_direction){
                    desiredList = lift;
                }
            }
            else{
                if(request_direction == 'down'){
                    if(lift.direction == requestion_direction && lift.current_floor <= request_direction){
                        desiredLift = lift;
                    }
                }
            }
        }

        desiredLift.addStops(request_floor);
    }

}