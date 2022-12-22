package ru.mirea.task21;

import java.util.ArrayList;

class Metro {
    ArrayList<String> lines = new ArrayList<String>();
    Metro() {
        lines.add("Altufievo");
        lines.add("Bibirevo");
        lines.add("Otradnoe");
        lines.add("Petrovsko-Razumovskaya");
        lines.add("Timiryazevskaya");
        lines.add("Dmitrovskaya");
        lines.add("Savyolovskaya");
        lines.add("Mendeleevskaya");
        lines.add("Tsevtnoy Bulvar");
        lines.add("Chehovskaya");
        lines.add("Borovitskaya");
        lines.add("Polyanka");
        lines.add("Serpuhovskaya");
        lines.add("Tulskaya");
        lines.add("Nagatinskaya");
        lines.add("Nagornaya");
    }
    public void PrintList(boolean state){
        for(int i = 0; i < lines.size(); i++){
            if(state){
                if(i % 2 == 0)
                    System.out.println("Line => " + lines.get(i));
            }
            else if(i % 2 == 1)
                System.out.println("Line => " + lines.get(i));
        }
    }
}