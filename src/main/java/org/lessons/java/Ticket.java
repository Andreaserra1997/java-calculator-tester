package org.lessons.java;

public class Ticket {
    private int km;
    private int age;

    public Ticket(int km, int age) {
        if (km <= 0 || age <= 0) {
            throw new IllegalArgumentException("I km e l'età devono essere > 0");
        }
        this.km = km;
        this.age = age;
    }
    // Metodi
    public double getPrice() {
        double price = 0.21;
        double total = km * price;
        double discount20 = 0.2;
        double discount40 = 0.4;

        if (age < 18) {
            total -= total * discount20;
        } else if (age > 65) {
            total -= total * discount40;
        }
        return total;
    }
}
