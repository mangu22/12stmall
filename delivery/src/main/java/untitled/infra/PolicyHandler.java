package untitled.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import untitled.config.kafka.KafkaProcessor;
import untitled.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderPlaced'"
    )
    public void wheneverOrderPlaced_StartShipping(
        @Payload OrderPlaced orderPlaced
    ) {
        OrderPlaced event = orderPlaced;
        System.out.println(
            "\n\n##### listener StartShipping : " + orderPlaced + "\n\n"
        );

        // Comments //
        //주문이 시작됐다는 이벤트가 발생하면 주문 발생에 대한걸 업데이트 해주기 위해 이벤트를 붙인다
        // 1. send payload to CJ
        // 2. 고객에게 배송시작 알림
        // 3. 우리장부에도 기록
        // 4. 기록

        // Sample Logic //
        Delivery.startShipping(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
