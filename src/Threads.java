import java.util.ArrayList;
import java.util.Collections;

public class Threads implements Runnable{
    int i;
    static ArrayList<Integer> evenNumbers = new ArrayList<>();
    static ArrayList<Integer> oddNumbers = new ArrayList<>();

    public Threads(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        synchronized (Collections.unmodifiableList(evenNumbers)){
            if (i%2 == 0){
                evenNumbers.add(i);
            }
        }
        synchronized (Collections.unmodifiableList(oddNumbers)){
            if (i%2 != 0){
                oddNumbers.add(i);
            }
        }
    }

    public static ArrayList<Integer> getEvenNumbers() {
        return evenNumbers;
    }

    public static ArrayList<Integer> getOddNumbers() {
        return oddNumbers;
    }
}
