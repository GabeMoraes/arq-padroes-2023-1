public class GoldTierInsurance extends Service{
    private int value = 2000;
    
    @Override
    public void showService(int discountFactor){
        System.out.println("Seguro nível Gold - Valor:\t" + this.value * (100-discountFactor) / 100);
    }
}
