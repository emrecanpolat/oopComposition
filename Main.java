package com.company;

public class Main {

    public static void main(String[] args) {

        Monitor monitor1 = new Monitor("Samsung-sync","samsung",19,"1920*1920");
        MotherBoard motherBoard1 = new MotherBoard("ryzen 7","amd",2,3,"biosful");
        ComputerCase computerCase1 = new ComputerCase("96-87 modeli","casper","220v");

        PersonalComputer personalComputer1 = new PersonalComputer("Fx-5005-dt", "Asus",monitor1,motherBoard1,computerCase1);


        personalComputer1.powerUp();


    }

}



