package de.egga.higher_order_java.declarative_programming;

import static org.assertj.core.api.Assertions.assertThat;

public class NetworkTest {

    public void shouldAdd() {
        Network network = new Network();
        Wire a = new Wire("a");
        Wire b = new Wire("b");
        Wire c = new Wire("c");

        Node inputNode = network.createIoNode("Input", a);
        network.createConstantNode(50, b);
        Node outputNode = network.createIoNode("Output", c);

        network.createAdderNode(a, b, c);

        inputNode.getWire("Wire").set(inputNode, 25);

        assertThat(outputNode.getWire("Wire").getValue()).isEqualTo(75);
    }
}