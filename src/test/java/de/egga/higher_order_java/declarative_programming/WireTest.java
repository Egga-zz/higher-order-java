package de.egga.higher_order_java.declarative_programming;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WireTest {

    public static final int VALUE = 42;
    private Node mockedNode;

    @Before
    public void setUp() throws Exception {
        mockedNode = mock(Node.class);
    }

    @Test
    public void shouldAttachNode() {
        Wire wire = new Wire(mockedNode);
        verify(mockedNode).attach(wire);
    }

    @Test
    public void shouldPropagateValueChanges() {
        Wire wire = new Wire(mockedNode);
        wire.setValue(VALUE);
        verify(mockedNode).handleValueUpdate(wire);
    }
}