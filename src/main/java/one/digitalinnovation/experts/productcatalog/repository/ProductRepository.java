package one.digitalinnovation.experts.productcatalog.repository;

import one.digitalinnovation.experts.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

import javax.validation.constraints.DecimalMax;
import java.util.List;


public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findByName(String name);
}