//import java.util.Scanner;
//
//public class AdvancedPractice {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int ch;
//        System.out.println("Enter Choice");
//        ch=scanner.nextInt();
//        switch (ch) {
//            case 1 -> {
//                System.out.println("Enter the time in seconds");
//                long sec = scanner.nextLong();
//                long x = sec;
//                int hour = 0;
//                int min = 0;
//                int se = 0;
//                while (sec / 3600 > 0) {
//                    sec -= 3600;
//                    hour++;
//                }
//                while (sec / 60 > 0) {
//                    min += 1;
//                    sec -= 60;
//                }
//                System.out.println("Hour:Min:Sec");
//                System.out.println(hour + ":" + min + ":" + sec);
//            }
//            case 2 ->{
//                System.out.println("Enter the number");
//                int n = scanner.nextInt();
//                int count=0;
//                int a,b,c,d;
//                for(a=1;a<=9;a++)
//                    for(b=1;b<=9;b++)
//                        for(c=1;c<=9;c++)
//                            for(d=1;d<=9;d++)
//                                if(a+b+c+d==n)
//                                    count++;
//                System.out.println("Number of combinations where a+b+c+d is: "+count);
//            }
//            case 3 ->{
//                System.out.println("Enter number of steps");
//                int n = scanner.nextInt();
//                int i,j;
//                for(i=1;i<=n;i++) {
//                    for (j = 1; j <= i; j++) {
//                        System.out.print("$");
//                    }
//                    System.out.print("\n");
//                }
//            }
//        }
//
//    }
//}
//class Library{
//    String[] books = new String[100];
//
//    String name = "A";
//
//
//}

class Rect{
    double len,bread;
    Rect(double l, double b){
        this.len = l;
        this.bread = b;
    }

    public double getLen() {
        return this.len;
    }

    public double getBread() {
        return this.bread;
    }

    double area(){
        return this.len*this.bread;
    }

}

class Cuboid extends Rect{
    public double height;
    Cuboid(double l, double b, double h){
        super(l,b);
        height = h;

    }
    double volume(){
        return this.height*this.len*this.bread;
    }
    double CSA(){
        return 30.5;
    }
    double TSA(){
        return 2*(this.len*this.bread+this.len*this.height+this.height*this.bread);
    }

    public double getHeight() {
        return this.height;
    }
}
public class AdvancedPractice {
    public static void main(String[] args) {
        Rect rect = new Rect(4,2);
        Cuboid cub = new Cuboid(5,3,4);
        System.out.println("Volume of cuboid is: "+cub.volume());
        System.out.println("Length of cuboid is: "+cub.len);

    }
}