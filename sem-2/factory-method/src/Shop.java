public abstract class Shop{

    public abstract Client createClient();
    
    public void newClient(){
        Client c = createClient();
        c.calcDiscount();
    }
}
