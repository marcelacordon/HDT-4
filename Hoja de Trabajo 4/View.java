
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: Marcela Cordon 
 * 
 * @since:21/02/2023
 **/



 public class View {
    String resp; 
    int respue;
    Scanner scan = new Scanner(System.in);
    Read r = new Read();

    ArrayList<String> rf = new ArrayList<String>();

    public void menu(){
        System.out.println("Que quieres hacer? Utilizar con \n 1. Vectores 2. Listas 3. Array");
        respue = scan.nextInt();
    }
    
    public void EscogerLista(){
        System.out.println("Con que tipo de lista quieres? \n 1. SinglyLinked 2. DoublyLinky");
        respue = scan.nextInt();
    }
    public String ingresardirec (){
        System.out.println("Ingrese la ruta del archivo ej C:\\ejemplos\\example1.txt");
        resp = scan.nextLine();
        String expression = r.leer(resp);
        return expression;
    }

    public void noOperandos(){
        System.out.println("No hay suficientes operandos para poder realizar la operacion");
    }

    public void dividirCero(){
        System.out.println("Esta operacion no se puede realizar, debido a que se divide entre cero");
    }

    public void simboloNoReconocido(){
        System.out.println("Esta operacion no se puede realizar, no se reconoce el simbolo utilizado.");
    }

     public void resultadoOPer(int res){
        System.out.println("El resultado es: " +  res);
    }
}

