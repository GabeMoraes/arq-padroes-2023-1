public class TurnedOffState extends PowerState {
    private final String stateName = "desligado";

    public String getStateName(){
        return this.stateName;
    }

    @Override
    public String toString(){
        return this.getStateName();
    }
    
    @Override
    public void pressPowerButton(Mobile mobile) {
        try {
            mobile.setPowerState("ON");
        } catch (Exception e) {
            System.err.println("Não foi possivel ligar o mobile");
            e.printStackTrace();
        }
    }
}
