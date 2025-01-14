package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String usrid;
    private String productnm;
    private String adress;
    private Long productid;
    private Integer qty;
    private String status;
}
