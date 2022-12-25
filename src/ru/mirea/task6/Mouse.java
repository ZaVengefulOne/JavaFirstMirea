package ru.mirea.task6;

public class Mouse extends Good{
    private int dpi;
    private String color;

    public Mouse(double price, int dpi, String color) {
        super(price);
        this.dpi = dpi;
        this.color = color;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "dpi=" + dpi +
                ", color='" + color + '\'' + ", " + super.toString() +
                '}';
    }
}