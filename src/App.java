import controllers.ListaEnlazada;
import controllers.Queue;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {

        runQueuekExample(args);

        //___________________________NODOS_____________________________
        // Node<Person> node1 = new Node<Person>(new Person(30,"Juan"));
        // Node<Person> node2 = new Node<Person>(new Person(35,"Maria"));
        // Node<Person> node3 = new Node<Person>(new Person(20,"Pepito"));
        // Node<Person> node4 = new Node<Person>(new Person(10,"Diego"));

        // node1.setNext(node2); //j->p
        // node1.setPrev(null); //m->p

        // //node2.setNext(null);
        // node2.setPrev(node1);
        // node2.setNext(node3);

        // node3.setNext(node4);
        // node3.setPrev(node2);

        // node4.setNext(null);
        // node4.setPrev(node3);

        // //NP.setNext(NP.getNext().getNext())

        // System.out.println("Node: " + node1);

        // System.out.println("Node: " + node2);

        // System.out.println("Node: " + node3);

        // System.out.println("Node: " + node4);

        

        

    }

    
    public static void runStackExample(String[] args) {
        // Stack<Person> persons = new Stack<Person>();

        // persons.push(new Person(30,"Juan"));
        // persons.push(new Person(35,"Maria"));
        // persons.push(new Person(20,"Pepito"));
        // persons.push(new Person(10,"Diego"));

        // System.out.println("Size=" + persons.size());

        // persons.printAllNodes();

        // System.out.println(persons.pop());

        // System.out.println("Size=" + persons.size());

        // persons.printAllNodes();
    }

    public static void runQueuekExample(String[] args) {
        // Queue<Person> persons = new Queue<Person>();
        // persons.enqueue(new Person(30,"Juan"));
        // persons.enqueue(new Person(35,"Maria"));
        // persons.enqueue(new Person(20,"Pepito"));
        // persons.enqueue(new Person(10, "Diego"));
        // System.out.println("Size=" + persons.size());
        // persons.printAllNodes();
        // System.out.println(persons.dequeue());
        // System.out.println("Primera" + persons.getFirst());
        // System.out.println("Ultima" + persons.getLast());
        // System.out.println("Size=" + persons.size());
        // persons.printAllNodes();
    }

    public static void runLinkedListExample(String[] args) {
        ListaEnlazada<Person> persons = new ListaEnlazada<Person>();
        persons.append(new Person(30,"Juan"));
        persons.append(new Person(35,"Maria"));
        persons.append(new Person(20,"Pepito"));
        persons.append(new Person(10, "Diego"));
        System.out.println("Size=" + persons.size());
        persons.printAllNodes();
        persons.deleteNode(new Person(10, "Diego"));
        persons.printAllNodes();
        persons.deleteFirst();
        persons.printAllNodes();
        persons.deleteLast();
        persons.printAllNodes();
        System.out.println("Size=" + persons.size());
    }
}

