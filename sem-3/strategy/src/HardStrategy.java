public class HardStrategy extends Strategy {
    public HardStrategy(){
        super();
        this.tier = "hard";
    }

    @Override
    public void play(GameTable gameTable){
        System.out.println("PC plays in "+this.getTier()+" mode.");

        // vai jogar primeiro sempre no canto, implementando o modo dificil.
        gameTable.setMark('O', 2, 0);
    }
}
