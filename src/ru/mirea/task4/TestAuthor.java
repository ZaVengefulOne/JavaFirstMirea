package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Andrey", "korpalo@mail.ru", 'M');
        System.out.println(a1);
        System.out.println("Change email:");
        a1.setEmail("OhHowSimple@gmail.com");
        System.out.println(a1);
    }
}