/**
 * @author:Marcela Cordon 
 * 
 * @since:21/02/2023
 **/

 import java.util.ArrayList;
 import java.util.EmptyStackException;
 import java.util.NoSuchElementException;
 
 public class Stack<E> implements IStack<E> {
 
     ArrayList<E> elementos = new ArrayList<E>();
  
     /** agrega un operando al stack
      * @param item
      */
     public void push(E item) { 
         elementos.add(item);
     }
 
     /** quita operandos del stack
      * @param (empty()
      * @return E
      * @throws EmptyStackExceptionif (empty())
      */
     public E pull() throws EmptyStackException { // 
         if (empty()) {
             throw new NoSuchElementException("No se puede realizar la acción -pop- en un stack vacío.");
 
         }
         return elementos.remove(elementos.size() - 1);
     }
 

     /** revisa si tiene elementos o no 
      * @return boolean
      */
     public boolean empty() { 
         return elementos.isEmpty();
 
     }
     
     /** regresa la cantidad de elementos
      * @return int
      */
     public int size() { 
        return elementos.size();

    }

    @Override
    public int count() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public void push(T value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }

    @Override
    public void push(T value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }
 
 
 
 }