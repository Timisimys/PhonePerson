package me.timisimys;

public class Main {

    public static void main(String[] args) {
        Phone Iphone = new Phone("+79999990099", "Iphone", 5);
        Phone Honor = new Phone("+78888880088", "Honor", 9);
        Phone Redmi = new Phone();

        System.out.println(Iphone.getNumber());
        System.out.println(Iphone.getModel());
        System.out.println(Iphone.getWeight());
        System.out.println();

        System.out.println(Honor.getNumber());
        System.out.println(Honor.getModel());
        System.out.println(Honor.getWeight());
        System.out.println();

        System.out.println(Redmi.getNumber());
        System.out.println(Redmi.getModel());
        System.out.println(Redmi.getWeight());
        System.out.println();

        Iphone.receiveCall("Петя");
        Honor.receiveCall("Вася");

        Iphone.receiveCall("Дима", "+78945612321");
        Honor.receiveCall("Настя", "89510263007");

        Iphone.sendMessage("TextTextText","89090909090", "+78529637441");
        Honor.sendMessage("JustText","+78945611223");


        Person person1 = new Person();
        Person person2 = new Person(52,"Настя");

        person1.PersonMove();
        person2.PersonMove();

        person1.PersonTalk();
        person2.PersonTalk();
    }
}
