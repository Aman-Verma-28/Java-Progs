import java.util.Scanner;

class Circle{
    double rad;
    String color;

    Circle(double r){
        this.rad = r;
    }
    Circle(double r, String c){
        this.rad= r;
        this.color = c;
    }

    public double getRad() {
        return this.rad;
    }

    double getArea(){
        return Math.PI*this.rad*this.rad;
    }

    public String getColor() {
        return color;
    }
}
class Cylinder extends Circle{
    double height;
    Cylinder(double height, double rad){
        super(rad);
        this.height = height;
    }
    Cylinder(double height, double rad, String c){
        super(rad,c);
        this.height = height;
    }

    @Override
    double getArea() {
        return 2*Math.PI*rad*rad;
    }
    double getVolume(){
        return Math.PI*rad*rad*height;
    }
    double getHeight(){
        return height;
    }
}
public class Prog3 {
    public static void main(String[] args) {
        double h1,h2,r1,r2;
        String c1,c2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter color for cylinder 1");
        c1 = scanner.nextLine();
        System.out.println("Enter color for cylinder 2");
        c2 = scanner.nextLine();
        System.out.println("Enter the height of cylinder 1");
        h1= scanner.nextDouble();
        System.out.println("Enter the height of cylinder 2");
        h2= scanner.nextDouble();
        System.out.println("Enter the radius of cylinder 1");
        r1= scanner.nextDouble();
        System.out.println("Enter the radius of cylinder 2");
        r2= scanner.nextDouble();
        Cylinder cylinder1 = new Cylinder(h1,r1,c1);
        Cylinder cylinder2 = new Cylinder(h2,r2,c2);
        if(cylinder1.getArea()==cylinder2.getArea() && cylinder1.getVolume()==cylinder2.getVolume() && cylinder1.getColor().equals(cylinder2.getColor()))
            System.out.println("Both cylinders are similar");
        else
            System.out.println("Different cylinders");

    }
}
//class Library{
//    private String[] available = new String[100];
////    private String[] issued = new String[10];
////    private int pointer;
//    Library(String[] books){
//        this.available = books;
////        this.pointer = -1;
//    }
//    void showBooks(){
//        if(this.available.length==0)
//            System.out.println("No books available at this time...");
//        else {
//            int i;
//            for (i = 0; i < this.available.length; i++)
//                System.out.println(this.available[i]);
//        }
//    }
////    void showIssuedBooks(){
////        if(this.issued.length==0){
////            System.out.println("No issued books right now...");
////        }
////        else{
////            for (String s : this.issued)
////                System.out.println(s);
////        }
////    }
//    String issue(String name){
//
//        for(int i=0;i<this.available.length;i++){
//            String s = this.available[i];
//            if(name.equals(s)) {
//                System.out.println("Book issued...");
//                this.available[i] = "-1";
//                return s;
//            }
//        }
//        return "Currently book you are looking for is not available";
//    }
//    void returnBook(String name){
//
//        for(int i=0;i<this.available.length;i++){
//            String s = this.available[i];
//            if(s.equals("-1")) {
//                System.out.println("Book returned...");
//                this.available[i] = name;
//            }
//        }
//
//    }
//
//
//}
//public class Prog3 {
//    public static void main(String[] args) {
//        String[] s = {"A","B", "C" ,"D" ,"E", "F", "G", "H", "I"};
//        Library lib = new Library(s);
//        lib.showBooks();
////        lib.showIssuedBooks();
//        lib.issue("C");
//        lib.showBooks();
//        lib.returnBook("C");
//
//
//    }
//}