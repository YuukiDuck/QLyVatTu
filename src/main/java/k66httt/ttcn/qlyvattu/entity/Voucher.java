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
@Table(name = "voucher")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String name;
    private String discountType;
    private BigDecimal discountValue;
    private BigDecimal minAmount;
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer quantity;
    private Boolean active;
    private LocalDateTime createdAt;
}

