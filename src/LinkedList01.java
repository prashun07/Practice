class List {
    int data;
    List next;
    List(int val){
        this.data=val;
        this.next=null;
    }
}
public class LinkedList01 {
    public void printList(List list){
        if(list.next==null)
            System.out.println("Empty List!!");
      while(list!=null)
      {
          System.out.print(list.data+" ");
          list=list.next;
      }
        System.out.println(" ");
    }
    public static void main(String args[])
    {
        LinkedList01 linkedList01=new LinkedList01();
        List list=new List(1);
        list.next=new List(2);
        list.next.next=new List(3);
        list.next.next.next=new List(4);
        linkedList01.printList(list);
    }
}
