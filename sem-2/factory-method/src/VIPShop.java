public class VIPShop extends Shop{
    @Override
    public Client createClient(){
        return new VIPClient();
    }
}
