package application.infra;

import application.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ManufacturingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Manufacturing>> {

    @Override
    public EntityModel<Manufacturing> process(
        EntityModel<Manufacturing> model
    ) {
        return model;
    }
}
