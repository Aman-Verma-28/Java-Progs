import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Student[] std=new Student[20];
        College[] clg=new College[20];
        Employee[] emp=new Employee[20];
        Scanner scanner = new Scanner(System.in);
        int stdNum, ColNum, EmpNum;
        System.out.println("Enter number of students");
        stdNum=scanner.nextInt();
        scanner.nextLine();
        int i,x;
        String Name, USN, city, state, country,EmpID;
        int street;
        for(i=0;i<stdNum;i++)
        {
            x=i+1;
            System.out.println("Enter name of "+x+" student");
            Name = scanner.nextLine();
            System.out.println("Enter USN of "+x+" student");
            USN  = scanner.nextLine();
            System.out.println("Enter city of "+x+" student");
            city = scanner.nextLine();
            System.out.println("Enter state of "+x+" student");
            state= scanner.nextLine();
            System.out.println("Enter country of "+x+" student");
            country= scanner.nextLine();
            System.out.println("Enter street of "+x+" student");
            street = scanner.nextInt();
            scanner.nextLine();
            Address temp = new Address(street,city,state,country);
            Student s = new Student(USN,Name, temp);
            std[i]=s;

        }
        System.out.println("Enter number of colleges");
        ColNum=scanner.nextInt();
        scanner.nextLine();

        for(i=0;i<ColNum;i++)
        {
            x=i+1;
            System.out.println("Enter name of "+x+" college");
            Name = scanner.nextLine();

            System.out.println("Enter city of "+x+" college");
            city = scanner.nextLine();
            System.out.println("Enter state of "+x+" college");
            state= scanner.nextLine();
            System.out.println("Enter country of "+x+" college");
            country= scanner.nextLine();
            System.out.println("Enter street of "+x+" college");
            street = scanner.nextInt();
            scanner.nextLine();

            Address temp = new Address(street,city,state,country);
            College c = new College(Name, temp);
            clg[i]=c;

        }

        System.out.println("Enter number of Employees");

        EmpNum=scanner.nextInt();
        scanner.nextLine();
        for(i=0;i<EmpNum;i++)
        {
            x=i+1;
            System.out.println("Enter name of "+x+" Employee");
            Name = scanner.nextLine();
            System.out.println("Enter ID of "+x+" Employee");
            EmpID = scanner.nextLine();


            System.out.println("Enter city of "+x+" Employee");
            city = scanner.nextLine();
            System.out.println("Enter state of "+x+" Employee");
            state= scanner.nextLine();
            System.out.println("Enter country of "+x+" Employee");
            country= scanner.nextLine();
            System.out.println("Enter street of "+x+" Employee");
            street = scanner.nextInt();
            scanner.nextLine();

            Address temp = new Address(street,city,state,country);
            Employee e = new Employee(EmpID,Name, temp);
            emp[i]=e;

        }
        System.out.println("Details of students");
        System.out.println("NUMBER\tNAME\tUSN\tSTREET\tCITY\tSTATE\tCOUNTRY");
        for(i=0;i<stdNum;i++) {
            x=i+1;
            System.out.println("\t"+x + "\t" + std[i].Name + "\t" + std[i].USN + "\t" + std[i].addr.street_num + "\t" + std[i].addr.city + "\t" +std[i].addr.state+"\t"+ std[i].addr.country);
        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Details of colleges");
        System.out.println("NUMBER\tNAME\tSTREET\tCITY\tSTATE\tCOUNTRY");
        for(i=0;i<ColNum;i++) {
            x=i+1;
            System.out.println("\t" +x+ "\t" + clg[i].Name + "\t" + clg[i].addr.street_num + "\t" + clg[i].addr.city + "\t" + clg[i].addr.state + "\t" + clg[i].addr.country);
        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Details of Employess");
        System.out.println("NUMBER\tNAME\tID\tSTREET\tCITY\tSTATE\tCOUNTRY");
        for(i=0;i<EmpNum;i++) {
            x=i+1;
            System.out.println("\t"+x + "\t" + emp[i].Name + "\t" + emp[i].EmpID + "\t" + emp[i].addr.street_num + "\t" + emp[i].addr.city + "\t" + emp[i].addr.state + "\t" + emp[i].addr.country);
        }
        System.out.println("--------------------------------------------------------------------------------------");




    }

}
class Student{
    Address addr;
    String USN;
    String Name;
    Student(String USN, String Name, Address addr){
        this.USN=USN;
        this.addr=addr;
        this.Name=Name;
    }
}
class College{
    String Name;
    Address addr;
    College(String Name, Address addr){
        this.addr=addr;
        this.Name=Name;
    }
}
class Employee{
    String EmpID, Name;
    Address addr;
    Employee(String EmpID, String Name, Address addr){
        this.addr=addr;
        this.EmpID=EmpID;
        this.Name= Name;
    }
}
class Address {
    int street_num;
    String city, state, country;

    Address(int street_num, String city, String state, String country) {
        this.street_num = street_num;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
