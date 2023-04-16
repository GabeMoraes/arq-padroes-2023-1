import java.util.Map;
import java.util.HashMap;

public class Invoker {

    public static Map<String, Command> commands = new HashMap<String, Command>();

    static{
        commands.put("NewClient", new NewClientCommand());
    }
    
    public static void invoke(String command, String clientType){
        commands.get(command).execute(clientType);
    }
}
