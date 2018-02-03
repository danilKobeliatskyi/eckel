package Danil.chapter13;

import java.util.*;

public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    private static final int W1 = 15;
    private static final int W2 = 5;
    private static final int W3 = 10;
    private String s1 = "%-" + W1 + "s %" + W2 + "s %" + W3 + "s\n";
    private String s2 = "%-" + W1 + ".15s %" + W2 + "d %" + W3 + ".2f\n";
    private String s3 = "%-" + W1 + "s %" + W2 + "s %" + W3 + ".2f\n";
    public void printTitle() {
        f.format(s1, "Item", "Qty", "Price");
        f.format(s1, "----", "---", "-----");
    }
    public void print(String name, int qty, double price) {
        f.format(s2, name, qty, price);
        total += price;
    }
    public void printTotal() {
        f.format(s3, "Tax", "", total * 0.06);
        f.format(s1, "", "", "-----");
        f.format(s3, "Total", "", total * 1.06);
    }
    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Chips Lays", 2, 24.25);
        receipt.print("Bread", 3, 10.1);
        receipt.print("Three axes", 1, 30.29);
        receipt.printTotal();
    }
}
