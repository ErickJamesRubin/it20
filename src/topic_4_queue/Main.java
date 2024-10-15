package topic_4_queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Queue customerQueue = new Queue();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first customer name to add to the queue: ");
        customerQueue.enqueue(new Customer(scanner.nextLine()));
        
        System.out.println("Enter second customer name to add to the queue: ");
        customerQueue.enqueue(new Customer(scanner.nextLine()));
        
        System.out.println("Enter third customer name to add to the queue: ");
        customerQueue.enqueue(new Customer(scanner.nextLine()));

        System.out.println("Serving a customer...");
        customerQueue.dequeue();

        System.out.println("Displaying the queue:");
        customerQueue.displayQueue();		 
    }
}
