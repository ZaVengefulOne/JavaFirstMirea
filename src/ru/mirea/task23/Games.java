package ru.mirea.task23;

public class Games {
    private int year = 0;
    private String developer = "";
    private String name ="";
    public Games(int year, String developer, String name){
        this.year = year;
        this.developer = developer;
        this.name = name;
    }
    public int hashCode() {
        int result = developer == null ? 0 : developer.hashCode();
        result = 31 * result + year;
        return result;
    }

    public static void main(String[] args){
        Games game1 = new Games(2011, "Blizzard Entertainment", "Warcraft 3: Reign of Chaos");
        Games game2 = new Games(2002, "Valve", "Portal 2");
        Games game3 = new Games(2014, "Blizzard Entertainment", "Hearthstone");
        Games game4 = new Games(1999, "The 3DO Company", "Heroes of Might and Magic 3"); //самая лучшая по мнению автора
        Games game5 = new Games(2012, "Arkane Studios", "Dishonored");

        if(game1.hashCode()==game1.hashCode()) {
            System.out.println("Game " + game1.developer + " " + game1.name + " is equal to the game " + game5.developer + " " + game5.name);
        }
        else System.out.println("Game " + game1.developer + " " + game1.name + " not equal to game " + game5.developer + " " + game5.name);
        System.out.println("Hash code of the  game " + game1.developer + " " + game1.name+  ": " + game1.hashCode());
        System.out.println("Hash code of the  game " + game5.developer + " " + game5.name+  ": " + game5.hashCode());
        System.out.println("");

        if(game1.hashCode()==game2.hashCode()) {
            System.out.println("Game " + game1.developer + " " + game1.name + " is equal to the game " + game2.developer + " " + game2.name);
        }
        else System.out.println("Game " + game1.developer + " " + game1.name + " not equal to game " + game2.developer + " " + game2.name);
        System.out.println("Hash code of the  game " + game1.developer + " " + game1.name+  ": " + game1.hashCode());
        System.out.println("Hash code of the  game " + game2.developer + " " + game2.name+  ": " + game2.hashCode());
        System.out.println("");

        if(game1.hashCode()==game3.hashCode()) {
            System.out.println("Game " + game1.developer + " " + game1.name + " is equal to the game " + game3.developer + " " + game3.name);
        }
        else System.out.println("Game " + game1.developer + " " + game1.name + " not equal to game " + game3.developer + " " + game3.name);
        System.out.println("Hash code of the  game " + game1.developer + " " + game1.name+  ": " + game1.hashCode());
        System.out.println("Hash code of the  game " + game3.developer + " " + game3.name+  ": " + game3.hashCode());
        System.out.println("");

        if(game1.hashCode()==game4.hashCode()) {
            System.out.println("Game " + game1.developer + " " + game1.name + " is equal to the game " + game4.developer + " " + game4.name);
        }
        else System.out.println("Game " + game1.developer + " " + game1.name + " not equal to game " + game4.developer + " " + game4.name);
        System.out.println("Hash code of the  game " + game1.developer + " " + game1.name+  ": " + game1.hashCode());
        System.out.println("Hash code of the  game " + game5.developer + " " + game4.name+  ": " + game4.hashCode());


    }
}