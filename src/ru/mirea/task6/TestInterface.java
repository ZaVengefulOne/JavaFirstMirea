package ru.mirea.task6;

public class TestInterface {
    public static void main(String[] args) {
        Priceable p = new Excursion("Krelin tour", 8298, 1.205);
        System.out.println(p);
        System.out.println(p.getPrice());
        p = new Laptop(124041, "HP ProBook 450 G8");
        System.out.println(p);
        p = new Mouse(800, 1800, "Black");
        System.out.println(p);
    }

}