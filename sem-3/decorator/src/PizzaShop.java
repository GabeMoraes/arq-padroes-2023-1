import java.util.Scanner;
public class PizzaShop {
    public static void main(String[] args) {
        
        /*Pizza p = new PepperoniPizza();
        Decorator kd = new KetchupDecorator(p);
        Decorator mud = new MustardDecorator(kd);
        Decorator mad = new MayonaiseDecorator(mud);

        mad.order();*/
        
        Pizza p = null;
        Decorator d = null;
        Scanner s = new Scanner(System.in);
        
        switch(Utils.selectPizza(s)){
            case "1":
            p = new PepperoniPizza();
            break;

            case "2":
            p = new CalabresaPizza();
            break;

            case "3":
            p = new MozzarelaPizza();
            break;
        }

        System.out.println("primeiro if");
        if(Utils.selectKetchup(s)){
            System.out.println("entrou if ketchup");
            d = new KetchupDecorator(p);
            p = d;
        }

        System.out.println("segundo if");
        if(Utils.selectMustard(s)){
            System.out.println("entrou if mostarda");
            d = new MustardDecorator(p);
            p = d;
        }

        System.out.println("terceiro if");
        if(Utils.selectMayonaise(s)){
            System.out.println("entrou if maionese");
            d = new MayonaiseDecorator(p);
            p = d;
        }

        if(p instanceof Decorator){
            ((Decorator)p).order();
        }
        else{
            p.order();
        }

        s.close();
    }
}
