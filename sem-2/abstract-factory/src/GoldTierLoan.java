public class GoldTierLoan extends Service{
    private int value = 10000;
    
    @Override
    public void showService(int discountFactor){
        System.out.println("Emprestimo nível Gold - Valor:\t" + this.value * (100-discountFactor) / 100);
    }
}