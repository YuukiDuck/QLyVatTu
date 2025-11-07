package k66httt.ttcn.qlyvattu.repository;

import k66httt.ttcn.qlyvattu.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Long> {}
