public class CommonShop extends Shop{
    @Override
    public Client createClient(){
        return new CommonClient();
    }
}
