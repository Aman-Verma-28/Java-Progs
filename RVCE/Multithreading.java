package RVCE;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i;
        for(i=0;i<40;i++)
            System.out.println("Thread1 is running");
        System.out.println("----------------------------------------------------");
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i;
        for(i=0;i<40;i++)
            System.out.println("Thread2 is running");
    }
}

class MyThread3 implements Runnable{
    public void run(){
        System.out.println("This the thread from the runnable interface");
    }
}
public class Multithreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();//In order to execute the thread, the start() method is used. start() is called on the object of the MyThread class. It automatically calls the run() method, and a new stack is provided to the thread. So, that's how you easily create threads by extending the thread class in Java.
        t2.start();
        MyThread3 t3 = new MyThread3();
        Thread t4 = new Thread(t3); //The constructor of the Thread class accepts the Runnable instance as an argument
        t4.start();
        // The runnable interface is preferred because it will use less memory as same object is shared whereas in extending the thread class new object is created for each thread and hence extra memory

    }
}

