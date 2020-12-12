class a{
    static void ab(){
        System.out.println("hey im static");
    }
}
public class staticmeth {
    public static void main(String[] args) {
        a.ab();//called by the class name without creating a object
    }
}