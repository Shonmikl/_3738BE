package _25102022.compare.stackAndQueue;

public class StackAndQueueTest {
    public static void main(String[] args) {
        testStack();
        testQueue();
    }

    private static void testQueue() {
        QueueImpl<Integer> queue = new QueueImpl<>();
        for (int i = 1; i < 10; i++) {
            System.out.print(i);
            queue.add(i);
        }

        System.out.println();
        while (!queue.isEmpty()) {
            System.out.print(queue.remove());
        }
    }

    private static void testStack() {
        StackImpl<Integer> stack = new StackImpl<>();
        for (int i = 1; i < 10; i++) {
            System.out.print(i);
            stack.push(i);
        }
        System.out.println();
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}