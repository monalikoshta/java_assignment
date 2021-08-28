import java.util.*;

interface Vehicle 
{
    public void wheelCount();
    public void speedUp(int newSpeed);
}

class Bicycle implements Vehicle
{
    public void wheelCount(){
        System.out.println("There are 2 wheels in the Bicycle.");
    }

    public void speedUp(int newSpeed){
        System.out.println("The speed is increased by "+ newSpeed);
    }
}

abstract class Car
{
    abstract public void color(String colr);

    public void start(){
        System.out.println("Car has started!");
    }
}

class Swift extends Car 
{
    public void color(String colr){
        System.out.println("The car has a color of "+ colr);
    }
}

class AbstractInterface
{
    public static void main(String[] args){
        Bicycle byc = new Bicycle();
        byc.wheelCount();
        byc.speedUp(5);

        Swift swCar = new Swift();
        swCar.color("red");
        swCar.start();
    }
}