package net.codejava;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query(value = "SELECT * FROM Product c WHERE c.name LIKE %:keyword% or c.brand %:keyword%",nativeQuery = true) 
             
          
	
	public List<Product> findByKeyword(@Param("keyword") String keyword);
}
