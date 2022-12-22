package ru.mirea.task15;

import java.io.*;
import java.util.Scanner;

public class WriteInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;

        try(FileWriter writer = new FileWriter("C:\\Users\\shalo\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\Info.txt")) {
            System.out.println("Введите информацию, которую необходимо передать в текстовый файл");
            text = scanner.nextLine();
            writer.write(text);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}