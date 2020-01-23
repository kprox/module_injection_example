package modules;

import com.google.inject.AbstractModule;
import services.FirstService;
import services.impl.FirstServiceDefaultImpl;

import static com.google.inject.name.Names.named;

public class BaseModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(FirstService.class).annotatedWith(named("DEFAULT")).to(FirstServiceDefaultImpl.class);
    }
}
