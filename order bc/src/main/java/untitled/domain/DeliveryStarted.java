package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long productid;
    private Long orderid;
    private String productnm;
    private Integer qty;
    private String adress;
    private String status;
}
