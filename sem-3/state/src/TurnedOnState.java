public class TurnedOnState extends PowerState {
    private final String stateName = "ligado";

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
            mobile.setPowerState("OFF");
        } catch (Exception e) {
            System.err.println("Não foi possivel desligar o mobile");
            e.printStackTrace();
        }
    }
}
