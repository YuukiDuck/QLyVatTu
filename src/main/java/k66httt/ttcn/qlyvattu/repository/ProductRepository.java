package k66httt.ttcn.qlyvattu.repository;

import k66httt.ttcn.qlyvattu.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByName(String name);
    boolean existsByCode(String code);
    List<Product> findByCategoryName(String category);

}
