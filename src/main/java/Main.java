import com.google.inject.Guice;
import com.google.inject.Injector;
import modules.BaseModule;
import modules.FirstModule;
import modules.SecondModule;

public class Main {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(
                new BaseModule(),
                new FirstModule(),
                new SecondModule()
        );

        injector.getInstance(App.class).run();
    }
}
