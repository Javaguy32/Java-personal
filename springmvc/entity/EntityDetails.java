
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class GroceryStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String promos;
    private String gifts;
    private BigDecimal deliveryFees;
    private double rating;
    private double distance;
    private int estimatedTime;
    
}

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String promos;
    private String gifts;
    private BigDecimal deliveryFees;
    private double rating;
    private double distance;
    private int estimatedTime;
    
}
