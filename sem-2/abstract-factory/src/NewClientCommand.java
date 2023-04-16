public class NewClientCommand extends Command {
    @Override
    public void execute(String clientType){
        ClientFactory f;
        switch(clientType.toLowerCase()){
            case "gold":
            f = new GoldTierClientFactory();
            f.newClient();
            break;
            
            case "silver":
            f = new SilverTierClientFactory();
            f.newClient();
            break;

            default:
            System.out.println("incorrect client type");
            break;
        }
    }
}
