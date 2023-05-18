public class Task3ThreadV3Maria implements Runnable{
    int count;
    Thread thread;
    static boolean stop = false;
    static String currentNameMaria61677;

    Task3ThreadV3Maria(String name){
        thread = new Thread(this, name);
        count = 0;
        currentNameMaria61677 = name;
    }

    public void run() {
        System.out.println(thread.getName() + " starts to operate");
        do{
            count++;
            if(currentNameMaria61677.compareTo(thread.getName()) !=0){
                currentNameMaria61677 = thread.getName();
                System.out.println(currentNameMaria61677 + " is executed");
            }

        }while(stop == false && count < 10_000_000);
        stop = true;
        System.out.println("\n"+ thread.getName() + " finishes running");
    }
}

class PriorityDemo{
    public static void main(String[] args) {
        Task3ThreadV3Maria mt1 = new Task3ThreadV3Maria("High Priority thread");
        Task3ThreadV3Maria mt2 = new Task3ThreadV3Maria("Thread with low priority");
        Task3ThreadV3Maria mt3 = new Task3ThreadV3Maria("Thread #1 with normal priority");
        Task3ThreadV3Maria mt4 = new Task3ThreadV3Maria("Thread #2 with normal priority");
        Task3ThreadV3Maria mt5 = new Task3ThreadV3Maria("Thread #3 with normal priority");

        mt1.thread.setPriority(Thread.MAX_PRIORITY);
        mt1.thread.setPriority(Thread.MIN_PRIORITY);
        mt2.thread.setPriority(Thread.NORM_PRIORITY - 4);

        mt1.thread.start();
        mt2.thread.start();
        mt3.thread.start();
        mt4.thread.start();
        mt5.thread.start();

        try{
            mt1.thread.join();
            mt2.thread.join();
            mt3.thread.join();
            mt4.thread.join();
            mt5.thread.join();
        }catch(InterruptedException e){
            System.out.println("The main thread starts jumping");
        }
        System.out.println("\nHigh Priority thread counted to "+ mt1.count);
        System.out.println("The low priority thread counted to "+ mt2.count);
        System.out.println("#1 Normal priority thread added to "+ mt3.count);
        System.out.println("#2 Normal priority thread added to "+ mt4.count);
        System.out.println("#3 Normal priority thread added to "+ mt5.count);
    }
}