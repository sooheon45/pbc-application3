package deliveryapp.domain;

import deliveryapp.domain.*;
import deliveryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;

    public OrderCanceled(Delivery aggregate) {
        super(aggregate);
    }

    public OrderCanceled() {
        super();
    }
}
