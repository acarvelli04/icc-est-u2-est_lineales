import models.Node;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Node<Person> node1 = new Node<Person>(new Person(30,"Juan"));
        Node<Person> node2 = new Node<Person>(new Person(35,"Maria"));
        Node<Person> node3 = new Node<Person>(new Person(20,"Pepito"));
        Node<Person> node4 = new Node<Person>(new Person(10,"Diego"));

        node1.setNext(node2); //j->p
        node1.setPrev(null); //m->p

        //node2.setNext(null);
        node2.setPrev(node1);
        node2.setNext(node3);

        node3.setNext(node4);
        node3.setPrev(node2);

        node4.setNext(null);
        node4.setPrev(node3);

        //NP.setNext(NP.getNext().getNext())

        System.out.println("Node: " + node1);

        System.out.println("Node: " + node2);

        System.out.println("Node: " + node3);

        System.out.println("Node: " + node4);
    }
}
