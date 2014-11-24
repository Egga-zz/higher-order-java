package de.egga.higher_order_java.rich_interfaces;


//TODO: How does this handle multiple inheritance of default methods?
class MyString implements CharSequence {

    String string;

    MyString(String string) {
        this.string = string;
    }

    @Override
    public char charAt(int index) {
        return string.charAt(index);
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new MyString((String) string.subSequence(start, end));

    }
}
