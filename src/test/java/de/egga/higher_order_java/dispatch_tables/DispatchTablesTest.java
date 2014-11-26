package de.egga.higher_order_java.dispatch_tables;

import org.junit.Test;

import static org.junit.Assert.*;

public class DispatchTablesTest {

    String data = "pick c59cf8a [UI] Activates Saros/I toolwindow and component\n" +
            "edit a43c1a4 [UI] Deleted the hint about several XMPP provider\n" +
            "fixup 7ae4802 [FIX] Fixes path implementation\n" +
            "squash b312848 [BUILD] Changes core SDK to project SDK\n" +
            "pick edf8d86 [BUILD] Exports test dependencies in IntelliJ\n"
            /*"reword cd69224 [FIX] Fixes bugs in file implementation"*/;


    @Test
    public void testParseHtml() throws Exception {
        new DispatchTables().parseHtml(data);
    }
}