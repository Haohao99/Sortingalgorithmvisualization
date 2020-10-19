import java.util.Observable;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Model extends Observable {

    public int[] raw;
    public int[] sort;

    public Model(int width, int height) {
        Random rand = new Random();
        raw = new int[width];

        for(int i = 0;i<width;i++){
            raw[i] = rand.nextInt(height);
//            System.out.println(raw[i]);
        }
        sort = raw;

    }

    @Override
    public void notifyObservers(){
        setChanged();
        super.notifyObservers();
    }

    public void bubblesort(int array[]) throws InterruptedException {
        for (int i = 0; i < array.length-1; i++){
            for (int j = 0; j < array.length-i-1; j++){
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            sort = array;
            notifyObservers();
            TimeUnit.MICROSECONDS.sleep(100);

        }




    }

    public int[] getsort(){
        return sort;
    }
}
