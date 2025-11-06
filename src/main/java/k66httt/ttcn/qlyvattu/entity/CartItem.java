package k66httt.ttcn.qlyvattu.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "cart_item")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;
    private BigDecimal price;
    private LocalDateTime createdAt;

    @ManyToOne @JoinColumn(name = "cart_id")
    private Cart cart;

    @ManyToOne @JoinColumn(name = "product_id")
    private Product product;
}

