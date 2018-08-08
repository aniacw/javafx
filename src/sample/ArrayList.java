package sample;

public class ArrayList <T> {
    private Object[] array;

    public ArrayList(int size){
        array= new Object[size];
    }

    public T get(int i){
        return (T)array[i];
    }

    public void add(T obj){

    }
}
