package k66httt.ttcn.qlyvattu.repository;

import k66httt.ttcn.qlyvattu.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {}
