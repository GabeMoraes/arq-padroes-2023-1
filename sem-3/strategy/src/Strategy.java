public abstract class Strategy {
    protected String tier;

    public abstract void play(GameTable gameTable);
    
    public String getTier(){
        return this.tier;
    }
}
