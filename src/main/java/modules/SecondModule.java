package modules;

import com.google.inject.AbstractModule;
import services.SecondService;
import services.impl.SecondServiceDefaultImpl;

public class SecondModule extends AbstractModule {

    public static final String MODULE_NAME = "SECOND";

    @Override
    protected void configure() {
        bind(SecondService.class).to(SecondServiceDefaultImpl.class);
    }
}
