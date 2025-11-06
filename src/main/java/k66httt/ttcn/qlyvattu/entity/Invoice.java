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
@Table(name = "invoice")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String invoiceCode;
    private BigDecimal totalAmount;
    private String payType;
    private Integer statusInvoice;
    private String note;
    private LocalDate createdDate;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne @JoinColumn(name = "user_address_id")
    private UserAddress userAddress;

    @ManyToOne @JoinColumn(name = "voucher_id")
    private Voucher voucher;
}
