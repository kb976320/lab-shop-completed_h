package labshopcompletedh.domain;

import java.util.*;
import labshopcompletedh.domain.*;
import labshopcompletedh.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
    private Double amount;
    private String status;
    private String address;
}
