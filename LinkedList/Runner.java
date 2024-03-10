package LinkedList;
public class Runner
{
    public static void main(String args[])
    {
        LinkedList list = new LinkedList();
        list.insertAtEnd(4);
        list.insertAtEnd(65);
        list.insertAtEnd(999);

        list.insertAtStart(25);

        list.insertAt(0,55);

        list.deleteAt(2);

        list.show();
    }
}
