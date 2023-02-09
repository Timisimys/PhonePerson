package me.timisimys;

public class Person {

    private String Name;
    private int Age;

    Person(int age, String name) {
        Age = age;
        Name = name;    }
    Person() {
        Name = "Неизвестно";
        Age = 0;
    }
    public void PersonTalk(){
        System.out.println("Такой то " + Name + " говорит");
    }
    public void PersonMove(){
        System.out.println("чпаквпвкпяпя пяк фяяп " );
    }

}
