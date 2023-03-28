public class BadShop extends Shop{
    @Override
    public Client createClient(){
        return new BadClient();
    }
}
