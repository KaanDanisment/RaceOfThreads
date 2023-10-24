import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i<10000; i++){
            numbers.add(i);
        }

        for (int i = 0; i<2500; i++){
            Thread thread = new Thread(new Threads(i));
            thread.start();
            thread.join();
        }
        for (int i = 2500; i< 5000;i++){
            Thread thread = new Thread(new Threads(i));
            thread.start();
            thread.join();
        }
        for (int i = 5000; i< 7500;i++){
            Thread thread = new Thread(new Threads(i));
            thread.start();
            thread.join();
        }
        for (int i = 7500; i< 10000; i++){
            Thread thread = new Thread(new Threads(i));
            thread.start();
            thread.join();
        }
        System.out.println(Threads.getEvenNumbers());
        System.out.println(Threads.getOddNumbers());
    }
}
