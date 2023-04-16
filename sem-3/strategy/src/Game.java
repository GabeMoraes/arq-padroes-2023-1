public class Game {
    private Strategy strategy;

    private GameTable gameTable;

    public Game(){
        System.out.println("New game beginning.");
        System.out.println("PC is playing O's");
        System.out.println("You are playing X's");
        this.gameTable = new GameTable();
    }

    public void setGameTableState(char mark, int xAxis, int yAxis){
        this.gameTable.setMark(mark, xAxis, yAxis);
    }

    public void setStrategy (Strategy strategy){
        this.strategy = strategy;
    }
    
    public void play(){
        this.strategy.play(this.gameTable);
    }
}
