package RVCE;
import Quiz.*;

import CSE.*;
class CSEDept extends CSE.ThirdSEM {
    CSEDept(){
        System.out.println("This is CSEDept constructor");
    }
//    public void greet(){
//        System.out.println("This is greet from the public class of CSEDept");
//    }
    public void greetProtected(){
        System.out.println("Protected method ");
    }
}
public class Prog4 {
    public static void main(String[] args) {
        CSEDept cseDept = new CSEDept();
        cseDept.greet();

        //cseDept.greetPrivate();  // -->throws error
        cseDept.greetProtected();
//        cseDept.greetDefault();
    }
}
