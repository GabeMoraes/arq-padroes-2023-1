public class Main {
    
    public static void main(String[] args) {
        /*Shop s[] = new Shop[3];
        s[0] = new VIPShop();
        s[1] = new CommonShop() ;
        s[2] = new BadShop();

        for(Shop i : s){
            i.newClient();
        }
        */

        Invoker.invoke("NewClient","vip");

    }
}
