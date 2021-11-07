package com.duclv2004110028.tuan09;

import java.util.Scanner;

public class Apple {
    int Id;
    float Weight;
    String Color;
    public static int autoId;
    Scanner sc = new Scanner(System.in);
    public void display()
    {
        System.out.println("=======================APPLE====================");
        System.out.printf("%-20S %-20S %-20S\n", "id", "weight","color");
    }
    public void displayApple()
    {
        System.out.printf("%-20d %-20.2f %-20S\n", this.Id, this.Weight, this.Color);
    }
    public Apple()
    {
    }
    public Apple( float weight, String color) {
        Id = Apple.autoId++;
        Weight = weight;
        Color = color;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public float getWeight() {
        return Weight;
    }
    public void setWeight(float weight) {
        Weight = weight;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }   
}
