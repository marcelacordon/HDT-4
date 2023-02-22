/**
**
 * @author:Marcela Cordon 
 * 
 * @since:21/02/2023
 **/

// codigo utilizado en la HDT del grupo 1

 import java.util.ArrayList;

 public class Calculadora implements IPostfixCalculator{
 
     
 
     Calculadora (){}
 
     @Override
     public boolean isOneItem(IStack operandos) {
         if (operandos.size() == 1){
             return true;
         }
         else{
             return false;
         }
     }
 
     @Override
     public int suma(int a, int b) {
         int respuesta = a + b;
         return respuesta;
     }
 
     @Override
     public int resta(int a, int b) {
         int respuesta = a - b;
         return respuesta;
     }
 
     @Override
     public int multiplicacion(int a, int b) {
         int respuesta = a * b;
         return respuesta;
     }
 
     @Override
     public int division(int a, int b) {
         int respuesta = a/b;
         return respuesta;
     }
 
     @Override
     public boolean isOperator(String item) {
         try {
             Integer.valueOf(item);
             return false;
         } 
         catch (NumberFormatException e) {
             return true;
         }     
     }
 
     @Override
     public ArrayList<String> getItems(String _expresion) {
         // TODO Auto-generated method stub
         ArrayList<String> ite = new ArrayList<String>();
         String [] items = _expresion.split(" ");
         for (int i = 0; i < items.length; i++){
             ite.add(items[i]);
         }
         return ite;
     }
     
 }
 