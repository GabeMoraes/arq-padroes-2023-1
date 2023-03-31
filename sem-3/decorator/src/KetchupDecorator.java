public class KetchupDecorator extends Decorator {
    public KetchupDecorator(Pizza decorates){
        super(decorates);
    }

    public void addKetchup(){
        System.out.println("\nAdicionou ketchup");
    }

    public void order(){
        super.order();
        addKetchup();
    }
}
