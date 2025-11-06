package k66httt.ttcn.qlyvattu.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "import_invoice_detail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImportInvoiceDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;
    private BigDecimal price;

    @ManyToOne @JoinColumn(name = "import_invoice_id")
    private ImportInvoice importInvoice;

    @ManyToOne @JoinColumn(name = "product_id")
    private Product product;
}

