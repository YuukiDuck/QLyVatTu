package k66httt.ttcn.qlyvattu.repository;

import k66httt.ttcn.qlyvattu.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findByName(String name);
}
