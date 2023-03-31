public class MayonaiseDecorator extends Decorator {
    public MayonaiseDecorator(Pizza decorates){
        super(decorates);
    }

    public void addMayonaise(){
        System.out.println("\nAdicionou maionese");
    }

    public void order(){
        super.order();
        addMayonaise();
    }
}