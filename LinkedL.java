import java.util.LinkedList;
public class LinkedL {
    public static void main(String args[]){
        LinkedList<String> name = new LinkedList<String>();
        name.add("Trinity");
        name.add("Jeol");
        name.add("Camera");
        name.add("Bathing");
        name.addFirst("Reading");
        name.addLast("John");
        for(String x: name){
            System.out.println(x);
        }
    }
}
