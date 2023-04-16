public class GameTable {
    private char[][] tableState = new char[3][3];

    public GameTable(){
        super();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                this.tableState[i][j] = ' ';
            }
        }

        this.printTable();
    }
    
    public void printTable(){
        System.out.println("---------------");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("| "+this.tableState[i][j]+" |");
            }
            System.out.print("\n");
        }
        System.out.println("---------------");
    }

    public void setMark(char mark, int xAxis, int yAxis){
        this.tableState[xAxis][yAxis] = mark;
        this.printTable();
    }

    public char[][] getTableState(){
        return this.tableState;
    }
}
