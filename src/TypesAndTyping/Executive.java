package TypesAndTyping;

import java.math.BigDecimal;

/**
 * Created by lizhe on 14/12/28.
 */
public class Executive extends Employee {
    public void raise(Number amount) {
        System.out.println("Executive get raise");
    }

    public void raise(BigDecimal amount) {
        System.out.println("Executive got outlandish raise");

    }
}
