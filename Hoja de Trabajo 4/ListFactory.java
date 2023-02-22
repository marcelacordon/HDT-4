public class ListFactory <T>{

    public IList<T> getInstance(int num){

        IList<T> listInstance;
        switch (num) {
            case 1:{
                listInstance = new SingleLinkedList<T>();
            }break;

            case 2:{
            listInstance = new DoubleLinkedList<T>();
            }break;

            default:{
                listInstance = null;
            }break;

            }
        return listInstance;
    }
}