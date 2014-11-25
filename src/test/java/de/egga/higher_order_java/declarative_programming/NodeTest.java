package de.egga.higher_order_java.declarative_programming;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class NodeTest {

    public static final int SOME_VALUE = 22;

    private Wire mockedWire;

    @Before
    public void setUp() throws Exception {
        mockedWire = mock(Wire.class);
    }

    @Test
    public void shouldNotifyAttachedNodes() {
        Node node = createNodeAttachedToWire();
        node.wires(w -> {
            w.setValue(SOME_VALUE);
        });
        verify(mockedWire).setValue(SOME_VALUE);
    }

    private Node createNodeAttachedToWire() {
        Node node = new NoOpNode();
        node.attach(mockedWire);
        return node;
    }
}