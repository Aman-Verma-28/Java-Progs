public class Inheritance {
    public static void main(String[] args) {
        Derived d = new Derived(4);
        d.setX(5);
        System.out.println(d.getX());
    }
}
// There should be only one public class in a file and any class in a package can not repeat
class Base{
    int x;
    Base(){
        System.out.println("I am in Base constructor");
    }
    Base(int x){
        System.out.println("Value of x is: "+x);
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base{
    Derived(int x){
        super(x);
        System.out.println("I am in derived constructor");

    }
}
class ExtraDerived extends Derived{
    ExtraDerived(){
        super(3);
        System.out.println("In grand child's constructor");
    }
    ExtraDerived(int x,int y){
        super(x);
        System.out.println("In grand child's constructor");
    }
}
