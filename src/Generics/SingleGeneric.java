package Generics;

public class SingleGeneric<T>{
    T obj;

    public SingleGeneric(T obj){
        this.obj=obj;
    }

    public T getObj() {
        return obj;
    }

    public static void main(String[] args) {
        SingleGeneric<Integer> singleGeneric = new SingleGeneric<Integer>(10);
        SingleGeneric<String> stringSingleGeneric = new SingleGeneric<String>("Junaid");

        System.out.println(singleGeneric.getObj());
        System.out.println(stringSingleGeneric.getObj());
    }
}
