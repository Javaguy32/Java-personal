import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;

@Configuration
public class IntegrationConfig {

    @Bean
    public IntegrationFlow groceryStoreFlow() {
        return IntegrationFlows.from("groceryStoreChannel")
                .filter(isStore())
				.handle(groceryStore())
                .get();
    }

    @Bean
    public IntegrationFlow restaurantFlow() {
        return IntegrationFlows.from("restaurantChannel").
                .filter(isStore())
				.handle(restaurant())
                .get();
    }
}

