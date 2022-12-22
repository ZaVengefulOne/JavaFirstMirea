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
        return this.year % 1998;

    }
//    public int hashCode() {
//        int result = developer == null ? 0 : developer.hashCode();
//        result = 31 * result + year;
//        return result;
//    }

    public static void main(String[] args){
        Games game1 = new Games(2012, "Arkane Studios", "Dishonored");
        Games game2 = new Games(2011, "Valve", "Portal 2");
        Games game3 = new Games(2012, "Blizzard Entertainment", "Diablo 3");
        Games game4 = new Games(1999, "The 3DO Company", "Heroes of Might and Magic 3"); //самая лучшая по мнению автора
        Games game5 = new Games(2002, "Blizzard Entertainment", "Warcraft 3: Reign of Chaos");

        if(game1.hashCode()==game5.hashCode()) {
            System.out.println("Game " + game1.name + " by " + game1.developer + " is equal to game " + game5.name + " by " + game5.developer);
        }
        else System.out.println("Game " + game1.name + " by " + game1.developer + " is not equal to game " + game5.name + " by " + game5.developer);
        System.out.println("Hash code of the game " + game1.name + " by " + game1.developer+  ": " + game1.hashCode());
        System.out.println("Hash code of the game " + game5.name + " by " + game5.developer+  ": " + game5.hashCode());
        System.out.println("");

        if(game1.hashCode()==game2.hashCode()) {
            System.out.println("Game " + game1.name + " by " + game1.developer + " is equal to game " + game2.name + " by " + game2.developer);
        }
        else System.out.println("Game " + game1.name + " by " + game1.developer + " is not equal to game " + game2.name + " by " + game2.developer);
        System.out.println("Hash code of the game " + game1.name + " by " + game1.developer+  ": " + game1.hashCode());
        System.out.println("Hash code of the game " + game2.name + " by " + game2.developer+  ": " + game2.hashCode());
        System.out.println("");

        if(game1.hashCode()==game3.hashCode()) {
            System.out.println("Game " + game1.name + " by " + game1.developer + " is equal to game " + game3.name + " by " + game3.developer);
        }
        else System.out.println("Game " + game1.name + " by " + game1.developer + " is not equal to game " + game3.name + " by " + game3.developer);
        System.out.println("Hash code of the game " + game1.name + " by " + game1.developer+  ": " + game1.hashCode());
        System.out.println("Hash code of the game " + game3.name + " by " + game3.developer+  ": " + game3.hashCode());
        System.out.println("");

        if(game1.hashCode()==game4.hashCode()) {
            System.out.println("Game " + game1.name + " by " + game1.developer + " is equal to game " + game4.name + " by " + game4.developer);
        }
        else System.out.println("Game " + game1.name + " by " + game1.developer + " is not equal to game " + game4.name + " by " + game4.developer);
        System.out.println("Hash code of the game " + game1.name + " by " + game1.developer+  ": " + game1.hashCode());
        System.out.println("Hash code of the game " + game4.name + " by " + game4.developer+  ": " + game4.hashCode());


    }
}