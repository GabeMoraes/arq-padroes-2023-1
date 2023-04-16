public class Mobile {

    PowerState powerState = new TurnedOffState();
    CameraAppState cameraAppState = new OutsideCameraAppState();
    

    protected void setPowerState(String powerState){
        switch(powerState.toUpperCase()){
            case "ON":
            this.powerState = new TurnedOnState();
            System.out.println("Mobile "+this.powerState);
            break;

            case "OFF":
            this.powerState = new TurnedOffState();
            System.out.println("Mobile "+this.powerState);
            break;
        }
    }
    

    protected void setCameraAppState(){
        
    }

    public void pressPowerButton(){
        this.powerState.pressPowerButton(this);
    }

    public void takePicture(){
        this.takePicture();
    }
}
