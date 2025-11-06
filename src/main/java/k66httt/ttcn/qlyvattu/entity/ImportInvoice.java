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
@Table(name = "import_invoice")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImportInvoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String importCode;
    private LocalDate createdDate;
    private BigDecimal totalAmount;
    private LocalDateTime createdAt;

    @ManyToOne @JoinColumn(name = "supplier_id")
    private Supplier supplier;
}

