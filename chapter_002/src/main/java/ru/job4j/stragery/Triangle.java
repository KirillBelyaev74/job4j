package ru.job4j.stragery;
public class Triangle implements Shape {
    public String draw() {
        StringBuilder pic = new StringBuilder();
        String ln = System.lineSeparator();
        pic.append("   *   \n");
        pic.append("  ***  \n");
        pic.append(" ***** \n");
        pic.append("*******\n");
        return pic.toString();
    }
}
