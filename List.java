
public class List {
    private Node head; //голова
    private Node tail; //хвост

    public List(){
        head =null;
        tail =null;
    }

    private boolean isEmpty(){
        return head == null;
    }

    public void addByIndex(int data, int index){
         Node cur = head;
         int c = 0;

         while (cur !=null && c!=index){
             cur =cur.next;
             c++;
            }
         Node temp = new Node(data);
         cur.prev.next=temp;
         temp.prev =cur.prev;
         cur.prev = temp;
         temp.next = cur;
    }

    public void removeAt(int key){
        Node cur = head;

        while(cur.data != key) {
            cur = cur.next;    //идем до элемента с начала списка

            if (cur == null) { //если дошли до конца (null) и такого элемента не нашли
                return;
            }
        }
            if(cur == head)
                removeFirst();  // если элемент самый первый -делаем метод removeFirst
            else
                cur.prev.next =cur.next;  //меняем ссылку
            if(cur == tail)
                removeLast();   // если элемент последний -делаем метод removeLast
            else
                cur.next.prev =cur.prev;  // меняем ссылку
        }

        Integer size(){
            Node cur = head;
            int c = 0;
            while (cur !=null ){
                cur =cur.next;
                c++;
            }
            System.out.println(c);
            return c;
        }


    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
    public void addFirst(int data) {
        Node temp = new Node(data);

        if (isEmpty())
            tail = temp;
        else
            head.prev = temp;
        temp.next = head;
        head = temp;
    }
    public void addLast(int data) {
        Node temp = new Node(data);

        if (isEmpty())
            head = temp;
        else
            tail.next = temp;
        temp.prev = tail;
        tail = temp;
    }
    public void removeFirst(){
        if(head.next == null){ //проверка, что в списке не один элемент
            tail =null;
        }else
            head.next.prev =null;

        head =head.next;
    }
    public void removeLast(){
        if(head.next == null){ //проверка, что в списке не один элемент
            head =null;
        }else
            tail.prev.next =null;

        tail =tail.prev;
    }

}
