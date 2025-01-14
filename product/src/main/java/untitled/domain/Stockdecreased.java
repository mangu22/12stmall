package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Stockdecreased extends AbstractEvent {

    private Long id;
    private String productnm;
    private String stock;

    public Stockdecreased(Inventory aggregate) {
        super(aggregate);
    }

    public Stockdecreased() {
        super();
    }
}
//>>> DDD / Domain Event
