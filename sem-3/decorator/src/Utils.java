import java.util.Scanner;

public abstract class Utils {
    public static String selectPizza(Scanner s){

        System.out.println("\nEscolha sua pizza:");
        System.out.println("\n1 - Pepperoni");
        System.out.println("2 - Calabresa");
        System.out.println("3 - Mussarela");

        String selected = s.nextLine();
        System.out.println(selected);

        return selected;
    }

    public static boolean selectMustard(Scanner s){
        
        boolean b = false;

        System.out.println("Deseja adicionar mostarda? (S/N)");

        String selected = s.nextLine();
        System.out.println(selected);

        if(selected.equals("s")){
            b = true;
            return b;
        }
        else{
            return b;
        }
    }

    public static boolean selectKetchup(Scanner s){

        boolean b = false;

        System.out.println("Deseja adicionar ketchup? (S/N)");

        String selected = s.nextLine();
        System.out.println(selected);

        switch(selected){
            case "s":
            b = true;
            break;

            default:
            break;
        }

        return b;
    }

    public static boolean selectMayonaise(Scanner s){

        boolean b = false;

        System.out.println("Deseja adicionar maionese? (S/N)");

        String selected = s.nextLine();
        System.out.println(selected);

        switch(selected){
            case "s":
            b = true;
            break;

            default:
            break;
        }

        return b;
    }
}
