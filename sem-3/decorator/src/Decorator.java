public abstract class Decorator extends Pizza{
    private Pizza pizza;

    public Decorator(Pizza decorates){
        this.pizza = decorates;
    }
    
    @Override
    public void order(){
        pizza.order();
    }
}
