package modules;

import com.google.inject.AbstractModule;
import services.FirstService;
import services.impl.FirstServiceAlternativeImpl;
import services.impl.FirstServiceDefaultImpl;

import static com.google.inject.name.Names.named;

public class FirstModule extends AbstractModule {

    public static final String MODULE_NAME = "FIRST";

    @Override
    protected void configure() {
        bind(FirstService.class).annotatedWith(named("DEFAULT")).to(FirstServiceDefaultImpl.class);
        bind(FirstService.class).annotatedWith(named("ALTERNATIVE")).to(FirstServiceAlternativeImpl.class);
    }
}
