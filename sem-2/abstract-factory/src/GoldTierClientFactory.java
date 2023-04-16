public class GoldTierClientFactory extends ClientFactory {
    @Override
    public Client createClient(){
        return new GoldTierClient();
    }

    @Override
    public Service createInsurance(){
        return new GoldTierInsurance();
    }

    @Override
    public Service createLoan(){
        return new GoldTierLoan();
    }
}
