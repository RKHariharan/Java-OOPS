package th1;
 class NumbersGenerator {
    private int currNumber = 1;
    private int num;
    private int total;

    public NumbersGenerator(final int numofthreads, final int t) {
        this.num = numofthreads;
        this.total = t;
    }

    public void printNumber(int index) {
        synchronized (this) {
            while(currNumber < total-1) {
                while (currNumber % num!= index) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }

                System.out.println(Thread.currentThread().getName() + " : " + currNumber++);
                notifyAll();
            }
        }
    }
}
public class Sequence {


    public static void main(String[] args) {
        int n = 3;
        int total = 10;
        NumbersGenerator numbersGenerator = new NumbersGenerator(n, total);

        Thread t1 = new Thread(new SequenceGenerator(numbersGenerator, 1), "THREAD-1");
        Thread t2 = new Thread(new SequenceGenerator(numbersGenerator, 2), "THREAD-2");
        Thread t3 = new Thread(new SequenceGenerator(numbersGenerator, 0), "THREAD-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
class SequenceGenerator implements Runnable {

    private NumbersGenerator numbersGenerator;
    private int index;

    public SequenceGenerator(NumbersGenerator numbersGenerator, int index) {
        this.numbersGenerator = numbersGenerator;
        this.index = index;
    }

    @Override
    public void run() {
        numbersGenerator.printNumber(this.index);
    }
}
