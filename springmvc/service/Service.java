import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroceryStoreService {

    @Autowired
    private GroceryStoreRepository groceryStoreRepository;

    public ResponseEntity<List<GroceryStore>> getStores(long id) {
     if(id > 0){
         return ResponseEntity.ok().body(groceryStoreRepository.findById(id)); 
     } else {
          return ResponseEntity.ok().body(groceryStoreRepository.findAll());
    } 
    }

    public ResponseEntity<String> removeStore(long id){
     if(id > 0){
         return ResponseEntity.ok().body(groceryStoreRepository.deleteById(id)); 
     } else {
         return ResponseEntity.ok().body("Error deleting the store...!"); 
     }
    }

    public ResponseEntity<String> addStore(GroceryStore store) {
        return ResponseEntity.ok().body(groceryStoreRepository.save(store))
    }
}

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

        public ResponseEntity<List<Restaurant>> getRest(long id) {
     if(id > 0){
         return ResponseEntity.ok().body(restaurantRepository.findById(id)); 
     } else {
          return ResponseEntity.ok().body(restaurantRepository.findAll());
    } 
    }

    public ResponseEntity<String> removerRest(long id){
     if(id > 0){
         return ResponseEntity.ok().body(restaurantRepository.deleteById(id)); 
     } else {
         return ResponseEntity.ok().body("Error deleting the restaurant...!"); 
     }
    }

    public ResponseEntity<String> addRest(Restaurant rest) {
        return ResponseEntity.ok().body(restaurantRepository.save(rest))
    }
    
}

