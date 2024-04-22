package Generics;

public class DualGeneric<T,C>{
    T obj1;
    C obj2;

    public DualGeneric(T obj1 , C obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void display(){
        System.out.print(obj1+" , ");
        System.out.print(obj2);
    }

    public static void main(String[] args) {
        DualGeneric<Integer , String> dualGeneric = new DualGeneric<Integer , String>(10,"Junaid");
        dualGeneric.display();
    }
}
