class abstract Floor{

    int abstract floor_number;

    public requestToGoUp(){
        controller.assignLift('up', floor_number);
    }

    public requestToGoDown(){
        controller.assignLift('down', floor_number);
    }

}