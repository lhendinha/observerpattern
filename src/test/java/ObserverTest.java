import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

public class ObserverTest {
    @Test
    public void testObserver() {
        System.out.println("Running: testObserver");

        Subject product = new Product("Xbox Series X", new BigDecimal(499));
        Observer bidder1 = new Bidder("Pedro Sousa");
        Observer bidder2 = new Bidder("Isabelle Lima");
        Observer bidder3 = new Bidder("Jonas Gomes");

        product.registerObserver(bidder1);
        product.registerObserver(bidder2);
        product.registerObserver(bidder3);

        product.setBidAmount(bidder1, new BigDecimal(599));

        product.removeObserver(bidder2);

        product.setBidAmount(bidder3, new BigDecimal(799));
    }
}