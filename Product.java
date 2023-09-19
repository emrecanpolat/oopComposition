package com.company;

public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

class Computer extends Product{
    public Computer(String model, String manufacturer) {
        super(model, manufacturer);
    }
}

class Monitor extends Product{
    private  int size;
    private  String resolution;



    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixel(int x, int y, String color){
        System.out.println("Monitör metodunda  % " + x + " % " + y + " kullanılarak, " + color + " rengi oluşturulmuştur.");

    }
}

class MotherBoard extends Product{
    private int ramSlots;
    private int cardSlots;
    private String bios;


    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println(programName + " Motherboard metodunda programı yüklendi");

    }
}

class ComputerCase extends Product{
    public String powerSupply;


    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("computer case metodunda pressed power button");

    }
}
