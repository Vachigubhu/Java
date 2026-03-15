import java.util.ArrayList;
public class Main{
    public static void main(String args[]){
       ArrayList<Integer> mylist = new ArrayList<Integer>(5);
       mylist.add(1);
       mylist.add(10);
       mylist.add(12);
       mylist.add(11);
       mylist.add(14);
       for(Integer x : mylist){
        System.out.print(x + " ");
       }
       System.out.println("\nThe size: "+ mylist.size());
       mylist.set(0, 20);
       for (Integer x : mylist) {
           System.out.print(x + " ");
       }
       System.out.println("\nThe size: " + mylist.size());
    }
}