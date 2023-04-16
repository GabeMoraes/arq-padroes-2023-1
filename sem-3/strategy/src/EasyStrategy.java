import java.util.concurrent.ThreadLocalRandom;

public class EasyStrategy extends Strategy {
    public EasyStrategy(){
        super();
        this.tier = "easy";
    }

    @Override
    public void play(GameTable gameTable){
        System.out.println("PC plays in "+this.getTier()+" mode.");
        
        // vai jogar primeiro em qualquer canto, implementando o modo facil.
        int randomX = ThreadLocalRandom.current().nextInt(0,3);
        int randomY = ThreadLocalRandom.current().nextInt(0,3);
        gameTable.setMark('O', randomX, randomY);
    }
}
