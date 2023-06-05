package lk.ijse;

// MyTask IS-A Thread
class MyTask extends Thread{
    @Override
    public void  run(){
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
        MyTask mt = new MyTask();
        mt.start();
        //mt.executeTask();



        //task 3   //by main thread
        for (int i = 1 ;i < 10; i++){
            System.out.println("Execute "  + i + "Task3");
        }

        //task 4
        System.out.println("-----Application Ended---");
    }
}
