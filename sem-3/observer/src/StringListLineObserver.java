import java.util.List;

public class StringListLineObserver extends Observer {
    public void update(List<String> stringList){
        System.out.println("observador de linha notificado: "+stringList);
    }
}