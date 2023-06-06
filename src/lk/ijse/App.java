package lk.ijse;

class Countable{
    public synchronized void count(int number){
        for (int i = 1; i < 10 ; i++) {
            System.out.println(i + number);

            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

// MyTask IS-A Thread
class MyTask1 implements Runnable{
    Countable cb;

    MyTask1(Countable cb){
        this.cb = cb;
    }

    @Override
    public void  run(){ //running step
        cb.count(10);
    }
}
/// task 02
class MyTask2 implements Runnable{
    Countable cb;

    MyTask2(Countable cb){
        this.cb = cb;
    }

    @Override
    public void  run(){ //running step
        cb.count(100);
    }
}

public class App {
    public static void main(String[] args) {

        Countable cb = new Countable();

        //task 02
        Runnable mt1 = new MyTask1(cb);
        Thread tr1 = new Thread(mt1); //--new state
        tr1.start();  //---> runnable state

        Runnable mt2 = new MyTask2(cb);
        Thread tr2 = new Thread(mt2); //--new state
        tr2.start();  //---> runnable state


        //task 4
        System.out.println("-----Application Ended---");
    }
}
