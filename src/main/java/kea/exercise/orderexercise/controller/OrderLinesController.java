package kea.exercise.orderexercise.controller;

import kea.exercise.orderexercise.model.OrderLine;
import kea.exercise.orderexercise.repository.OrderLineRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orderlines")
public class OrderLinesController {

    private OrderLineRepository orderLineRepository;

    public OrderLinesController(OrderLineRepository orderLineRepository) {
        this.orderLineRepository = orderLineRepository;
    }

    @GetMapping
    public List<OrderLine> getAllOrderLines() {
        return orderLineRepository.findAll();
    }
}
