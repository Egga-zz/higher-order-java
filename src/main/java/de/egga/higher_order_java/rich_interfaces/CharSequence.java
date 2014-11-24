package de.egga.higher_order_java.rich_interfaces;

/**
 * Interfaces with default methods can implement a lot of functionality
 * in terms of the abstract interface methods.
 */
public interface CharSequence {

    char charAt(int index);
    int length();
    CharSequence subSequence(int start, int end);

    default public CharSequence subSequence(int end) {
        return subSequence(0, end);
    }

    default public boolean isEmpty() {
        return length() == 0;
    }

    default public boolean equals(CharSequence other) {
        if (length() != other.length())
            return false;
        for (int i = 0; i < length(); i++) {
            if (charAt(i) != other.charAt(i))
                return false;
        }
        return true;
    }

}
