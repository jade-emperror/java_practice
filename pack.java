import java.util.Scanner;

import arraypack.array;//importing package

class LinearSearch{
    void search(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.print("key found at"+i);
                break;
            }
        }
    }
}
public class pack {
    public static void main(String[] args) {
        ArrayOne arr=new ArrayOne();
        int a[]=arr.makeArray();        
        arr.showArray();
        LinearSearch ls = new LinearSearch();
        Scanner scan = new Scanner(System.in);
        ls.search(a, scan.nextInt());
    }
}
