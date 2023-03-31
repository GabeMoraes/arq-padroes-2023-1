public class MustardDecorator extends Decorator {
    public MustardDecorator(Pizza decorates){
        super(decorates);
    }

    public void addMustard(){
        System.out.println("\nAdicionou mostarda");
    }

    public void order(){
        super.order();
        addMustard();
    }
}
