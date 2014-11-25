package de.egga.higher_order_java.declarative_programming;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author egga
 */
@RequiredArgsConstructor
public class Wire {

    private final Collection<Node> attachedNodes = new ArrayList<>();

    private Object value;

    public Wire(Node... nodes) {
        for (Node node : nodes) {
            attachedNodes.add(node);
            node.attach(this);
        }
    }

    public void setValue(Object value) {
        this.value = value;
        attachedNodes.forEach(n -> n.handleValueUpdate(this));
    }
}
