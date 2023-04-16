import java.util.ArrayList;
import java.util.List;

public abstract class Subject{

    private List<Observer> observers = new ArrayList<>();
    
    public void attach(Observer o){
        this.observers.add(o);
    }

    public void detach(Observer o){
        this.observers.remove(o);
    }

    public void notifyObservers(List<String> stringList){
        for(Observer  o : observers){
            o.update(stringList);
        }
    }
}