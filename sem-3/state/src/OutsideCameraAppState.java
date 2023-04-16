public class OutsideCameraAppState extends CameraAppState {
    private final String stateName = "fechado";

    public String getStateName(){
        return this.stateName;
    }

    @Override
    public String toString(){
        return this.getStateName();
    }

    @Override
    public void takePicture(Mobile mobile) {
        try {
            
        } catch (Exception e) {
            System.err.println("Não foi possivel abrir o app Camera");
            e.printStackTrace();
        }
    }
}