public class NewClientCommand extends Command{
    
    @Override
    public void execute(String clientType){
        Shop s;
        switch(clientType.toLowerCase()){
            
            case "vip":
            s = new VIPShop();
            s.newClient();
            break;

            case "common":
            s = new CommonShop();
            s.newClient();
            break;
            
            case "bad":
            s = new BadShop();
            s.newClient();
            break;
        }
    }
}
