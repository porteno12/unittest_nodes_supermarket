import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

public class SuperMarketTest {

    @Test
    public void testBuyEggs_StoreFound() {
        SuperMarket store1 = new SuperMarket("Store1", 10);
        SuperMarket store2 = new SuperMarket("Store2", 20);
        SuperMarket store3 = new SuperMarket("Store3", 30);

        Node<SuperMarket> node3 = new Node<>(store3, null);
        Node<SuperMarket> node2 = new Node<>(store2, node3);
        Node<SuperMarket> node1 = new Node<>(store1, node2);

        Main.buyEggs(node1, 20);
        // Add assertions for output if needed.
    }

    @Test
    public void testBuyEggs_StoreNotFound() {
        SuperMarket store1 = new SuperMarket("Store1", 10);
        SuperMarket store2 = new SuperMarket("Store2", 20);
        SuperMarket store3 = new SuperMarket("Store3", 30);

        Node<SuperMarket> node3 = new Node<>(store3, null);
        Node<SuperMarket> node2 = new Node<>(store2, node3);
        Node<SuperMarket> node1 = new Node<>(store1, node2);

        Main.buyEggs(node1, 25);
        // Add assertions for output if needed.
    }

    @Test
    public void testBuyEggs_HandlesInfiniteLoop() {
        SuperMarket store1 = new SuperMarket("Store1", 10);
        SuperMarket store2 = new SuperMarket("Store2", 20);

        Node<SuperMarket> node1 = new Node<>(store1);
        Node<SuperMarket> node2 = new Node<>(store2);

        node1.setNext(node2);
        node2.setNext(node1); // Creates an infinite loop

        // Check for infinite loop
        try {
            long startTime = System.currentTimeMillis();
            Main.buyEggs(node1, 20);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;

            // Ensure the method runs within a reasonable time (e.g., 2000ms)
            assertTrue(duration < 2000, "Method took too long, possible infinite loop detected.");
        } catch (Exception e) {
            fail("The method threw an unexpected exception: " + e.getMessage());
        }
    }
}
