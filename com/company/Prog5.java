package com.company;

interface Animal{
    void drink();
    default void eat(){
        System.out.println("Animal eating...");
    }
    void sound();
    static void hi(){
        System.out.println("hi");
    }
//    void jump();

}
interface TiredAnimal extends Animal{
    int maxBeforeTired = 10;
    int play(int h);
    void check();
}
class Lion implements TiredAnimal{
    boolean isHungry, isThirsty;
    int hour;
    int fun(int x,int y){
        return x+y;
    }
    int fun(int x,int y,int z){
        return x+y;
    }
    public void eat(){
        if(isHungry) {
            System.out.println("Lion is eating flesh...");
            isHungry = false;
        }
    }
    void hunger(){
        this.isHungry = true;
    }
    void thirst(){
        this.isThirsty= true;
    }
    public void drink(){
        if(isThirsty){
            System.out.println("Lion is drinking...");
            isThirsty = false;
        }
    }
    public int play(int h){
        this.hour+=h;
//        System.out.println("Lion played for "+this.hour+" hours");
        return hour;
    }
    public void check(){
        if(isTired()){
            System.out.println("Lion is tired it cant play anymore...");
        }
        else
            System.out.println("Lion can play for: "+(maxBeforeTired-this.hour)+" hours");
    }
    private boolean isTired(){
        return this.hour < maxBeforeTired;
    }
    public void sound(){
        System.out.println("Lion is making sound...");
    }
}

class Snake implements TiredAnimal{
    boolean isHungry, isThirsty;
    int hour;
    public void eat(){
        if(isHungry) {
            System.out.println("Snake is eating its pray...");
            isHungry = false;
        }
    }
    void hunger(){
        this.isHungry = true;
    }
    void thirst(){
        this.isThirsty= true;
    }
    public void drink(){
        if(isThirsty){
            System.out.println("Snake is drinking...");
            isThirsty = false;
        }
    }
    public int play(int h){
        this.hour+=h;
//        System.out.println("Lion played for "+this.hour+" hours");
        return hour;
    }
    public void check(){
        if(isTired()){
            System.out.println("Snake is tired it cant play anymore...");
        }
        else
            System.out.println("Snake can play for: "+(maxBeforeTired-this.hour)+" hours");
    }
    private boolean isTired(){
        return this.hour < maxBeforeTired;
    }
    public void sound(){
        System.out.println("Snake is making sound...");
    }
}

public class Prog5 {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.hunger();
        lion.eat();
        System.out.println("lion played for total: "+ lion.play(2) + " hours");
        lion.sound();
    }
}
