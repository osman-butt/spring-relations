package kea.exercise.orderexercise.repository;

import kea.exercise.orderexercise.model.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineRepository extends JpaRepository<OrderLine,Integer> {
}
