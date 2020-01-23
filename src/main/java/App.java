import com.google.inject.Inject;
import test.FirstApp;
import test.SecondApp;

public class App implements Runnable {

    @Inject
    private FirstApp firstApp;

    @Inject
    private SecondApp secondApp;

    @Override
    public void run() {
        System.out.println("FIRST SERVICE:");
        firstApp.execute();

        System.out.println("SECOND SERVICE:");
        secondApp.execute();
    }
}
