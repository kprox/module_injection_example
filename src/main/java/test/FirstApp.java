package test;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import services.FirstService;

public class FirstApp {

    @Inject
    @Named("DEFAULT")
    private FirstService defaultFirstService;

    @Inject
    @Named("ALTERNATIVE")
    private FirstService alternativeFirstService;

    public void execute() {
        System.out.println("DEFAULT:");
        defaultFirstService.print();
        System.out.println("ALTERNATIVE");
        alternativeFirstService.print();
    }
}
