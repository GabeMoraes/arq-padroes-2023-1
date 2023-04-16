public class OnCameraAppState extends CameraAppState {
    private final String stateName = "aberto" ;

    public String getStateName(){
        return this.stateName;
    }

    @Override
    public String toString(){
        return this.getStateName();
    }
    
    @Override
    public void takePicture(Mobile mobile) {
        // TODO Auto-generated method stub
        
    }
}
