public class StackFactory <T>{

    public IStack<T> getInstance(int num){

        IStack<T> StackInstance;
        switch (num) {
            case 1:{
                StackInstance = (IStack<T>) new SingleLinkedList<T>();
            }break;

            case 2:{
                StackInstance = (IStack<T>) new DoubleLinkedList<T>();
            }break;

            default:{
                StackInstance = null;
            }break;

            }
        return StackInstance;
    }
}
