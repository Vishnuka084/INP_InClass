package lk.ijse;

class ABC{
    void temp(){
        System.out.println("hello ...");
    }
}

// MyTask IS-A Thread
class MyTask extends ABC implements Runnable{
    @Override
    public void  run(){ //running step
        for (int i = 1; i < 10; i++){
            System.out.println("Execute " + i + " Task02 ");
        }
    }

//    void executeTask(){
//        for (int i = 1; i < 10; i++){
//            System.out.println("Execute " + i + " Task02 ");
//        }
//    }
}

public class App {
    public static void main(String[] args) {
        //task 01
        System.out.println("-----Application started-----");


        //task 02
        Runnable mt = new MyTask();
        Thread tr = new Thread(mt); //--new
        tr.setDaemon(true);
        tr.start();  //---> runnable


        System.out.println(tr.isDaemon());//demon thread

       /*
        < short cut >
        new Thread(new MyTask()).start(); // child thread / worker
        */
        //mt.executeTask();



        //task 3   //by main thread
        for (int i = 1 ;i < 10; i++){
            System.out.println("Execute "  + i + "Task3");
        }

        //task 4
        System.out.println("-----Application Ended---");
    }
}
