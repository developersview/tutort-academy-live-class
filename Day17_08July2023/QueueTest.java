/**
 * @author pranoy.chakraborty
 * @Date 08/07/2023
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue(1000);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        System.out.println(queue.pop() + " dequeued from queue");
        System.out.println("Front item is " + queue.front());
        System.out.println("Rear item is " + queue.rear());
    }
}
