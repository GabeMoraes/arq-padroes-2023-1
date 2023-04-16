public class SilverTierClientFactory extends ClientFactory {
    @Override
    public Client createClient(){
        return new SilverTierClient();
    }

    @Override
    public Service createInsurance(){
        return new SilverTierInsurance();
    }

    @Override
    public Service createLoan(){
        return new SilverTierLoan();
    }
}
