package de.egga.higher_order_java.declarative_programming;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * @author egga
 */
@RequiredArgsConstructor
public abstract class Node {

    private Collection<Wire> wires = new ArrayList<>();

    public void attach(Wire wire) {
        wires.add(wire);
    }

    protected void wires(Consumer<Wire> operation) {
        wires.forEach(operation);
    }

    public abstract void handleValueUpdate(Wire wire);
}
