package k66httt.ttcn.qlyvattu.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "history_pay")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class HistoryPay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String requestId;
    private BigDecimal totalAmount;
    private LocalDate createdDate;
    private LocalDateTime createdTime;
    private String paymentMethod;
    private String status;

    @ManyToOne @JoinColumn(name = "invoice_id")
    private Invoice invoice;
}
