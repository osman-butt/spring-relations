package kea.exercise.orderexercise;

import jakarta.persistence.criteria.Order;
import kea.exercise.orderexercise.model.OrderLine;
import kea.exercise.orderexercise.model.Product;
import kea.exercise.orderexercise.repository.OrderLineRepository;
import kea.exercise.orderexercise.repository.ProductRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    private final ProductRepository productRepository;
    private OrderLineRepository orderLineRepository;
    public InitData(ProductRepository productRepository,OrderLineRepository orderLineRepository) {
        this.productRepository = productRepository;
        this.orderLineRepository = orderLineRepository;
    }

    public void run(String... args) {
        System.out.println("InitData is running");

        Product product = new Product();
        product.setName("Frozen peas");
        product.setDescription("Fresh frozen out of the bag");
        product.setPrice(29.95);
        product.setEAN13("5701232098173");
        productRepository.save(product);

        Product product1 = new Product();
        product1.setName("Organic Peanut Butter");
        product1.setDescription("Smooth and creamy, made from 100% organic peanuts");
        product1.setPrice(12.99);
        product1.setEAN13("9780590353427");
        productRepository.save(product1);

        Product product2 = new Product();
        product2.setName("Handcrafted Soy Candle");
        product2.setDescription("Soothing lavender scent, made with natural soy wax");
        product2.setPrice(19.99);
        product2.setEAN13("9780061241895");
        productRepository.save(product2);

        OrderLine line1 = new OrderLine();
        line1.setProduct(product);
        line1.setQuantity(3);
        orderLineRepository.save(line1);

        OrderLine line2 = new OrderLine();
        line2.setProduct(product1);
        line2.setQuantity(2);
        orderLineRepository.save(line2);

        OrderLine line3 = new OrderLine();
        line3.setProduct(product1);
        line3.setQuantity(0);
        orderLineRepository.save(line3);
    }

}
