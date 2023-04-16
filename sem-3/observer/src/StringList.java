import java.util.ArrayList;
import java.util.List;

public class StringList extends Subject {
    
    private List<String> stringList = new ArrayList<>();

    public void addString(String string){
        this.stringList.add(string);
        notifyObservers(this.getStringList());
    }

    public List<String> getStringList(){
        return this.stringList;
    }
}