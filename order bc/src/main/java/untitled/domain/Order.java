package untitled.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import untitled.OrderBcApplication;

@Entity
@Table(name = "Order_table")
@Data
//<<< DDD / Aggregate Root
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String usrId;

    private String productNm;

    private String adress;

    private Long productId;

    private Integer qty;

    private String status;

    public static OrderRepository repository() {
        OrderRepository orderRepository = OrderBcApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }

    //<<< Clean Arch / Port Method
    public static void updateOrderStatus(DeliveryStarted deliveryStarted) {
        //implement business logic here:

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        OrderStatusUpdated orderStatusUpdated = new OrderStatusUpdated(order);
        orderStatusUpdated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        // if deliveryStarted.cjLogisId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> deliveryMap = mapper.convertValue(deliveryStarted.getCjLogisId(), Map.class);

        repository().findById(deliveryStarted.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);

            OrderStatusUpdated orderStatusUpdated = new OrderStatusUpdated(order);
            orderStatusUpdated.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
