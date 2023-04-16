public class SilverTierClient extends Client {
    @Override
    public void showClient(){
        System.out.println("Tabela de servicos - Cliente Silver:");
    }
    
    @Override
    public int calcDiscount(){
        return 5;
    }
}
