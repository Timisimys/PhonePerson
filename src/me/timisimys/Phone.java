package me.timisimys;

public class Phone {
    private String number;
    private String model;
    private double weight;

    Phone(String n, String m, double w) {
        this (n, m);
        weight = w;
    }
    Phone(String n, String m) {
        number = n;
        model = m;
    }
    Phone() {

    }


    public String getModel() {
        return model;
    }


    public double getWeight() {
        return weight;
    }

    void receiveCall(String name) {
        System.out.println("Вызов " + name);
    }
    void receiveCall(String name, String number) {
        System.out.println("Номер " + number + " звонит " + name);
    }

    public String getNumber() {
        return number;
    }

    void sendMessage(String message, String... numbers) {
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("На номер " + numbers[i] + " отправлено сообщение \"" + message + "\"");
        }

    }
}
