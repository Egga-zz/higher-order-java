package de.egga.higher_order_java.declarative_programming;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

import static java.util.stream.Collectors.toMap;

/**
 * @author egga
 */
public class Node {

    private static Map<String, Integer> names = new HashMap<>();


    private final String name;

    private BiConsumer<Node, Map<String, Integer>> behavior;

    private Map<String, Wire> wires;

    public Node(String baseName, BiConsumer<Node, Map<String, Integer>> behavior, Map<String, Wire> wires) {
        this.name = createName(baseName);
        this.behavior = behavior;
        this.wires = wires;

        wires.values().forEach(w -> w.attachNode(this));

    }


    public void notifyValueChange() {
        Map<String, Integer> values = wires.values().stream()
                .collect(toMap(Wire::getName, w -> w.reportValue(this)));
        getBehavior().accept(this, values);
    }

    private void revokeWire(String name) {
        Wire wire = getWire(name);
        wire.revoke(this);
    }

    private String createName(String baseName) {
        if (!names.containsKey(baseName)) {
            names.put(baseName, 0);
        }
        Integer count = names.get(baseName);
        ++count;
        return baseName + count;
    }


    public String getName() {
        return name;
    }

    BiConsumer<Node, Map<String, Integer>> getBehavior() {
        return behavior;
    }

    Wire getWire(String name) {
        return wires.get(name);
    }

}
