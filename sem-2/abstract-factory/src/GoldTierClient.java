public class GoldTierClient extends Client {
    @Override
    public void showClient(){
        System.out.println("Tabela de servicos - Cliente Gold:");
    }
    
    @Override
    public int calcDiscount(){
        return 10;
    }
}
