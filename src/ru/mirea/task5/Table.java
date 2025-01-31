package ru.mirea.task5;

public class Table extends Furniture {
    private String material;
    private int drawerCount;

    public Table(String modelName, int legCount, double height, double width, double depth, int price, String material, int drawerCount) {
        super(legCount, height, width, depth, false, price, modelName);
        this.material = material;
        this.drawerCount = drawerCount;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDrawerCount() {
        return drawerCount;
    }

    public void setDrawerCount(int drawerCount) {
        this.drawerCount = drawerCount;
    }

    @Override
    public void jumpOn() {
        System.out.println("You jump on the table and hit your head on the ceiling...");
    }

    @Override
    public String toString() {
        return "Table{" +
                "material='" + material + '\'' +
                ", drawerCount=" + drawerCount + ", " + super.toString() +
                '}';
    }
}