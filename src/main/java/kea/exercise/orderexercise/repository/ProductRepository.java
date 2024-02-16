package kea.exercise.orderexercise.repository;

import kea.exercise.orderexercise.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
