package repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pojo.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
}
