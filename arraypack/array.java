package arraypack;
import java.util.Scanner;//same as array.java but used for package

class ArrayOne{
    Scanner scan;
    int arrsize;
    int arr[];
    ArrayOne(){
        scan=new Scanner(System.in);
        System.out.println("enter array size");
        arrsize=scan.nextInt();
    }
    int[] makeArray(){
        arr = new int[arrsize];
        for (int i=0;i<arrsize;i++){
            System.out.println("enter element "+(i+1)+" :");
            arr[i]=scan.nextInt();
        }
        return arr;
    }
    void showArray(){
        System.out.println("DISPLAY");
        for (int i=0;i<arrsize;i++){
            System.out.println(arr[i]);
        }
    }
}
class ArrayTwo{
    Scanner scan;
    int row;
    int col;
    int arr[][];
    ArrayTwo(){
        scan=new Scanner(System.in);
        System.out.println("enter row and col");
        row=scan.nextInt();
        col=scan.nextInt();
    }
    int[][] makeArray(){
        arr = new int[row][col];
        for (int i=0;i<row;i++){
          for (int j=0;j<col;j++){
            System.out.println("enter element "+i+j+" :");
            arr[i][j]=scan.nextInt();
          }
        }
        return arr;
    }
    void showArray(){
        System.out.println("DISPLAY");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
              System.out.print(arr[i][j]+" ");
            }
          }System.out.print('\n');
    }
}
public class array{
    public static void main(String[] args) {
        int arr1d[],arr2d[][];
        ArrayOne a1 = new ArrayOne();
        arr1d=a1.makeArray();
        a1.showArray();
        ArrayTwo a2 = new ArrayTwo();
        arr2d=a2.makeArray();
        a2.showArray();
    }
}