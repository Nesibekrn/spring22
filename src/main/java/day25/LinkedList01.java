package day25;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        //adding operation in LinkedList
        linked.add("A");
        linked.add(0, "Bubble");
        linked.addAll(list);
        linked.addAll(1, list);
        linked.addFirst("K");
        linked.addLast("V");
        System.out.println("Before removing: " + linked);
        //removing operation in Linked List
        System.out.println(linked.remove());//Removes the first node, returns it to you
        System.out.println(linked.remove("W"));//Removes the first occurrence of the specified element from this list, it will return boolean
        System.out.println(linked.remove(3));//Removes the element at the specified position in this list, it will return the removed element
        //linked.removeAll(list);//Removes all of this collection's elements that are also contained in the specified collection.
        linked.removeIf(t->t.length()<2);
        //linked.clear();//Removes all elements, makes the list empty
        //System.out.println(linked.element());//Retrieves, but does not remove, the head (first element) of this list. ==> copy+paste
        //NoSuchElementException – if this list is empty
        System.out.println(linked.peek());//Retrieves, but does not remove, the head (first element) of this list. ==> copy+paste
        // "null" if this list is empty
        linked.poll();//Retrieves and removes the head (first element) of this list. ==> cut+paste
        //null if this list is empty
        //Find the method Retrieves and removes the first element, returns error for the empty linked list
        System.out.println("After removing: " + linked);
    }
}