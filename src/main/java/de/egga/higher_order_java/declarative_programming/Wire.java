package de.egga.higher_order_java.declarative_programming;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author egga
 */
public class Wire {

    private final String name;

    private Integer value;

    private Node settor;

    private Collection<Node> attachedNodes = new ArrayList<>();

    public Wire(String name) {
        this.name = name;
    }

    public void set(Node settor, Integer newValue) {
        if (getSettor() == null || getSettor().equals(settor)) {
            setValue(newValue);
            setSettor(settor);
            notifyAllBut(settor);
        } else if (getSettor() != null) {
            if (!newValue.equals(getValue())) {
                throw new InconsistentValueException("Wire " + getName() + " inconsistent value (" + newValue + " != " + getValue() + ")");
            }
        }
    }

    public void revoke(Node revoker) {
        if (getValue() == null) {
            return;
        }
        if (!getSettor().equals(revoker)) {
            return;
        }
        setValue(null);
        notifyAllBut(revoker);
        setSettor(null);
    }

    private void notifyAllBut(Node settor) {
        getAttachedNodes()
                .stream()
                .filter(n -> !n.equals(settor))
                .forEach(n -> n.notifyValueChange());
    }

    public Integer reportValue(Node querent) {
        if (querent.equals(getSettor())) {
            return null;
        }
        return getValue();
    }

    public String getName() {
        return name;
    }


    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getSettor() {
        return settor;
    }

    public void setSettor(Node settor) {
        this.settor = settor;
    }

    public Collection<Node> getAttachedNodes() {
        return attachedNodes;
    }

    public void attachNode(Node node) {
        attachedNodes.add(node);
    }

}
