
public class Ranner {

    public static void main(String[] args) {
        List list = new List();

        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.addByIndex(4,1);

        list.print();

        System.out.println();
//        list.removeFirst();
 //       list.removeLast();
         list.removeAt(4);
        list.print();
        System.out.println();
        list.size();
    }


}