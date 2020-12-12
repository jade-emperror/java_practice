class meth{
    void met(){
        System.out.print("i am meth from met");
    }
}
public class method {
    static void myMethod() {
      System.out.println("I just got executed!");
    }
  
    public static void main(String[] args) {
      myMethod();
      meth obj=new meth();
      obj.met();
    }
  }