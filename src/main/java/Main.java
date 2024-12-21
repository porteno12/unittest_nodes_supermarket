public class Main {
    public static void main(String[] args) {
        // Example usage of the method
        SuperMarket store1 = new SuperMarket("Store1", 10);
        SuperMarket store2 = new SuperMarket("Store2", 20);
        SuperMarket store3 = new SuperMarket("Store3", 30);

        Node<SuperMarket> node3 = new Node<>(store3, null);
        Node<SuperMarket> node2 = new Node<>(store2, node3);
        Node<SuperMarket> node1 = new Node<>(store1, node2);

        // Call the method with an example amount
        buyEggs(node1, 20);  // Expected to find Store2
        buyEggs(node1, 25);  // Expected to print "no store has that eggs amount"
        buyEggs(null, 10);   // Expected to handle empty list gracefully
    }

    public static void buyEggs(Node<SuperMarket> stores, int amount) {
        // TODO: Student's implementation
    }
}
