import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroceryStoreService {

    @Autowired
    private GroceryStoreRepository groceryStoreRepository;

}

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

}

