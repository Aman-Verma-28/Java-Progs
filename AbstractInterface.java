abstract class Phone{ // This is a standard of something which has to be done we cant create an object of this abstract class
    Phone(){
        System.out.println("Classes with any abstract method is called abstract class");
        System.out.println("Any method without the definition is called the abstract method any subclass of this class has to implement the the abstract method to be a concrete class");
        System.out.println("If it does not implement the abstract method then it will also be an abstract class");
    }
    abstract void switchOff();
    abstract void ring();
}
class Redmi extends Phone{
    Redmi(){
        System.out.println("If the abstract class's method is not implemented within the derived class then there will be error ");
    }
    @Override
    void switchOff(){
        System.out.println("My redmi phone is switching off");
    }
    @Override
    void ring(){
        System.out.println("My redmi phone is ringing");
    }
}

interface Cycle{
    void speedDown(int dec);
    void speedUp(int inc);
}
interface Horn{
    void sound1();
    void sound2();
    void sound3();
}
class Avon extends Phone implements Cycle,Horn {
    int speed = 45;
    void switchOff(){
        System.out.println("Lock the bicycle");
    }
    void ring(){
        System.out.println("Unlock the bicycle");
    }
    public void speedUp(int inc){
        this.speed+=inc;
    }
    public void speedDown(int dec){
        this.speed-=dec;
    }
    public void sound1(){
        System.out.println("Horn 1");
    }
    public void sound2(){
        System.out.println("Horn 2");
    }
    public void sound3(){
        System.out.println("Horn 3");
    }
}
public class AbstractInterface {
    public static void main(String[] args) {
//        System.out.println("We can not create an object of an interface and an abstract class only concrete class objects can be created");
        TV tv = new TV();
        tv.changeChannel();
        tv.changeVolume();
        tv.openNetworks();

    }
}


abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    @Override
    void write(){
        System.out.println("Writing with the pen");
    }
    @Override
    void refill(){
        System.out.println("Refilling the pen");
    }
    void changeNib(){
        System.out.println("Changing nib");
    }
}

interface TVRemote{
    void changeChannel();
    void changeVolume();
}

interface SmartTVRemote extends TVRemote{
    void openYouTube();
    void openNetworks();
}

class TV implements SmartTVRemote{
    @Override
    public void openNetworks() {
        System.out.println("Opening Networks");
    }
    public void openYouTube() {
        System.out.println("Opening YouTube");
    }
    public void changeChannel(){
        System.out.println("Changing channel");
    }
    public void changeVolume(){
        System.out.println("Changing volume");
    }

}