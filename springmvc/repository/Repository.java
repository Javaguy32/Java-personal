import org.springframework.data.jpa.repository.JpaRepository;

public interface GroceryStoreRepository extends JpaRepository<GroceryStore, Long> {
}

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}

