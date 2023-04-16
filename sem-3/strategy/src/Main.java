public class Main {
    public static void main(String[] args) {
        Game g = new Game();
        Strategy es = new EasyStrategy();
        g.setStrategy(es);
        g.play();
    }
}