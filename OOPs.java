import java.util.Random;
import java.util.Scanner;

class Stud{
    private int id;
    private String name; // Since we have given private access to the name var, we cant access it using dot operator
    // We need to use getter and setter
    // Setter
    void setId(int i){
        id=i;
        // We can check validity if we want that's why we use setter
    }
    void setName(String n){
        name = n;
    }
    // Constructor does not need to return anything and its name should be same as the name of the class and we can also overload the constructor.
    Stud(String myName, int myId){
        id = myId;
        name = myName;
    }
    void getDetails(){
        System.out.println("My name is: "+ name);
        System.out.println("My id is: "+ id);
    }
}
class Square{
    int side;
    Scanner scanner = new Scanner(System.in);
    void setSide(){
        System.out.println("Enter side length: ");
        side = scanner.nextInt();
    }
    int area()
    {
        return side*side;
    }
    int perimeter(){
        return 4*side;
    }
}
class Emp{
    int salary;
    int getSalary(){
        return salary;
    }
    String name;
    String getName(){
        return name;
    }
    void setName(String newName){
        name = newName;
    }
}
public class OOPs {
    public static void main(String[] args) {
        Game game = new Game();
        while(game.getAttempt()>=0){
            game.takeUserInput();
            if(game.check())
                break;
        }
        if(game.getAttempt()<=0) {
            System.out.println("You lost the game");
            System.out.println("Correct number was: "+ game.n);
        }
    }
}

class Game{
    int n;
    int user;

    Scanner scanner = new Scanner(System.in);
    private int attempt = 9;
    int getAttempt(){
        return attempt;
    }
    Game(){
        Random rand = new Random();
        n = rand.nextInt(101);
        System.out.println("Guess the number(1-100) you have 10 attempts");
    }
    void takeUserInput(){
        user = scanner.nextInt();
    }
    boolean check(){
        if(user==n){
            System.out.println("Correct Guess in: "+(10-attempt)+" attempts");
            return true;
        }
        else if(user>n){
            System.out.println("Your input is larger than correct number");
            System.out.println("No of attempts left: "+ attempt);
        }
        else{
            System.out.println("Your input is smaller than correct number");
            System.out.println("No. of attempts left: "+ attempt);
        }
        attempt--;
        return false;
    }
}