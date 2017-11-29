package hu.helixlab.tb;


public class Rectangle {
    private double length;
    private double width;
    private String color;

    public Rectangle(){

    }

    public Rectangle(double length, double width, String color){
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void print(){
        System.out.println("Color: " + color + "Length: " + length + "Width: " + width);
    }
}
