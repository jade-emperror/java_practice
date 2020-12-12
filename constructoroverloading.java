class aclass{
    aclass(){
        System.out.println("constructor without arg");
    }
    aclass(String fname){
        System.out.println("hi "+fname);
    }
    aclass(String fname,String lname){
        System.out.println("hi "+fname+" "+lname);
    }
}
public class constructoroverloading {
    public static void main(String[] args)  {
        aclass obj = new aclass();
        aclass obj1 = new aclass("Jade");
        aclass obj2 = new aclass("Jade","Emperror");
    }
}
