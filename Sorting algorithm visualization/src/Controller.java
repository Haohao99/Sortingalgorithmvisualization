import java.util.Observable;
import java.util.Observer;

public class Controller implements Observer {

    private static View view1;
    private static Model model1;

    public static void main(String[] args) throws InterruptedException {
        Controller controller = new Controller();
        Model model = new Model(1920,1080);
        model.addObserver(controller);
        View view = new View(1920, 1080);

        model1 = model;
        view1 = view;
        model1.bubblesort(model.raw);
//        view1.draw(model1.raw);

    }

    @Override
    public void update(Observable o, Object arg) {
//        System.out.println("GGGGGGGGGG");
        view1.draw(model1.getsort());
    }
}
