import java.util.List;
import java.util.ListIterator;

public class StringListTableObserver extends Observer {
    public void update(List<String> stringList){
        System.out.println("observador de tabela notificado: ");
        System.out.println("--------------TABELA-DE-STRINGS------------");
        ListIterator<String> iterator = stringList.listIterator();
        while(iterator.hasNext()){
            int pos = iterator.nextIndex();
            System.out.println("String:\t"+iterator.next()+"\tPosicao:\t"+pos);
        }
        System.out.println("-------------------------------------------");
    }
}
