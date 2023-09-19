package com.company;

public class PersonalComputer extends Product {

    private Monitor monitor;
    private MotherBoard motherboard;
    private ComputerCase computercase;

    public PersonalComputer(String model, String manufacturer, Monitor monitor, MotherBoard motherboard, ComputerCase computercase) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computercase = computercase;
    }

    private void drawLogo(){
        monitor.drawPixel(1200,50,"green");

    }

    public void powerUp(){
        computercase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("windows");
    }



//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public MotherBoard getMotherboard() {
//        return motherboard;
//    }
//
//    public ComputerCase getComputercase() {
//        return computercase;
//    }


}
