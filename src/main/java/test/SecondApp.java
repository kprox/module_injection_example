package test;

import com.google.inject.Inject;
import services.SecondService;

public class SecondApp {

    @Inject
    private SecondService secondService;

    public void execute() {
        secondService.test();
    }
}
