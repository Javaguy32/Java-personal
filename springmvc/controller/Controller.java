import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/grocery-stores")
public class GroceryStoreController {

    @Autowired
    private GroceryStoreService groceryStoreService;

    @GetMapping("/getStores/{id}")
    public ResponseEntity<List<GroceryStore>> getStores(@PathParam("id") long id){
        gorceryStoreService.getStores(id);
    }

    @PostMapping("/addStore")
    public ResponseEntity<String> addStore(@RequestBody GroceryStore store){
        groceryStoreService.addStore(store);
    }

    @DeleteMapping("/removeStore/{id}")
    public ResponseEntity<String> removeStore(@PathParam("id") long storeId){
        groceryStoreService.removeStore(storeId);
    }

}

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/getRest/{id}")
    public ResponseEntity<List<Restaurant>> getRest(@PathParam("id") long id){
        restaurantService.getRest(id);
    }

    @PostMapping("/addRest")
    public ResponseEntity<String> addRest(@RequestBody Restaurant rest){
        restaurantService.addRest(rest);
    }

    @DeleteMapping("/removeRest/{id}")
    public ResponseEntity<String> removeRest(@PathParam("id") long restId){
        restaurantService.removeRest(restId);
    }

}

