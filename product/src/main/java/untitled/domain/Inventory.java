package untitled.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import untitled.ProductApplication;

@Entity
@Table(name = "Inventory_table")
@Data
//<<< DDD / Aggregate Root
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productNm;

    private String stock;

    public static InventoryRepository repository() {
        InventoryRepository inventoryRepository = ProductApplication.applicationContext.getBean(
            InventoryRepository.class
        );
        return inventoryRepository;
    }

    //<<< Clean Arch / Port Method
    public static void decreaseStock(OrderPlaced orderPlaced) {
        //implement business logic here:

        /** Example 1:  new item 
        Inventory inventory = new Inventory();
        repository().save(inventory);

        Stockdecreased stockdecreased = new Stockdecreased(inventory);
        stockdecreased.publishAfterCommit();
        Soldout soldout = new Soldout(inventory);
        soldout.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        // if orderPlaced.pgId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> orderMap = mapper.convertValue(orderPlaced.getPgId(), Map.class);

        repository().findById(orderPlaced.get???()).ifPresent(inventory->{
            
            inventory // do something
            repository().save(inventory);

            Stockdecreased stockdecreased = new Stockdecreased(inventory);
            stockdecreased.publishAfterCommit();
            Soldout soldout = new Soldout(inventory);
            soldout.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
