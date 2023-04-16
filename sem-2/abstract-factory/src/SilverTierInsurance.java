public class SilverTierInsurance extends Service {
    private int value = 2000;
    
    @Override
    public void showService(int discountFactor){
        System.out.println("Seguro nível Silver - Valor:\t" + this.value * (100-discountFactor) / 100);
    }
}
