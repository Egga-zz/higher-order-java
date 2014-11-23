package de.egga.higher_order_java.declarative_programming;

import java.util.Map;
import java.util.function.BiConsumer;

import static com.google.common.collect.ImmutableMap.of;

/**
 * @author egga
 */
public class Network {


    public Node createIoNode(String name, Wire wire) {
        return new Node(name, (node, values) -> {
            Integer value = values.get("Wire");
            if (value == null) {
                System.out.println(name + " : no longer defined");
            } else {
                System.out.println(name + " : " + value);
            }
        }, of("Wire", wire));

    }

    public Node createConstantNode(Integer value, Wire wire) {
        Node constantNode = new Node("Constant", (node, values) -> {
        }, of("Wire", wire));
        wire.set(constantNode, value);
        return constantNode;
    }

    public Node createAdderNode(Wire addend1, Wire addend2, Wire sum) {
        return new Node("Adder", getAdderBehavior(), of(
                "Addend1", addend1,
                "Addend3", addend2,
                "Sum", sum
        ));
    }

    public BiConsumer<Node, Map<String, Integer>> getAdderBehavior() {
        BiConsumer<Node, Map<String, Integer>> behavior = (node, values) -> {
            Integer addend1Value = values.get("Addend1");
            Integer addend2Value = values.get("Addend2");
            Integer sumValue = values.get("Sum");

            Wire addend1Wire = node.getWire("Addend1");
            Wire addend2Wire = node.getWire("Addend2");
            Wire sumWire = node.getWire("Sum");

            if (addend1Value != null && addend2Value != null) {
                sumWire.set(node, addend1Value + addend2Value);
            } else {
                sumWire.revoke(node);
            }

            if (addend1Value != null && sumValue != null) {
                addend2Wire.set(node, sumValue - addend1Value);
            } else {
                addend2Wire.revoke(node);
            }

            if (addend2Value != null && sumValue != null) {
                addend1Wire.set(node, sumValue - addend2Value);
            } else {
                addend1Wire.revoke(node);
            }
        };
        return behavior;
    }
}
