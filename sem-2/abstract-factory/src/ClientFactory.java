public abstract class ClientFactory {
    
    public abstract Client createClient();

    public abstract Service createInsurance();

    public abstract Service createLoan();

    public void newClient(){
        Client c = createClient();
        c.showClient();
        Service i = createInsurance();
        i.showService(c.calcDiscount());
        Service l = createLoan();
        l.showService(c.calcDiscount());
    }
}
