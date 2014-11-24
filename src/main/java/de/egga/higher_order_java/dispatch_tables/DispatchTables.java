package de.egga.higher_order_java.dispatch_tables;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

/**
 * @author holger-s
 */
public class DispatchTables {

    Map<String, Function<String, Boolean>> handlers = new HashMap<>();


    public DispatchTables() {
        handlers.put("pick", this::pick);
        handlers.put("edit", this::edit);
        handlers.put("fixup", this::fixup);
        handlers.put("squash", this::squash);
    }

    void parseHtml(String data) {
        asList(data.split("\n")).forEach(
                (line) -> {
                    String command = line.split(" ")[0].trim();
                    String content = line.substring(command.length());
                    handlers.get(command).apply(content);
                }
        );
    }

    boolean pick(String content) {
        System.out.println("picked the line: " + content);
        return false;
    }

    boolean edit(String content) {
        System.out.println("edited the line: " + content);
        return false;
    }

    boolean fixup(String content) {
        System.out.println("fixuped the line: " + content);
        return false;
    }

    boolean squash(String content) {
        System.out.println("squashed the line: " + content);
        return false;
    }
}
