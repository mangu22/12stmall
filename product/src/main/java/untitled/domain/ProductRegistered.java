package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductRegistered extends AbstractEvent {

    private Long id;
    private String id;
    private String productnm;

    public ProductRegistered(Inventory aggregate) {
        super(aggregate);
    }

    public ProductRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
