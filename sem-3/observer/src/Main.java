public class Main{
    
    public static void main (String[] args){

        StringList sl = new StringList();
        StringListLineObserver sllo = new StringListLineObserver();
        StringListTableObserver slto = new StringListTableObserver();
        sl.attach(sllo);
        sl.attach(slto);
        sl.addString("a");
        sl.addString("b");
        sl.addString("c");
        sl.addString("d");
        sl.addString("23");
    }
}