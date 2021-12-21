package enumabstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderStateTest {

    @Test
    void testNewConfirmedPrepared() {
        OrderState order = OrderState.NEW;
        assertTrue(order.canDelete());
    }

    @Test
    void testOnboardDeliveredReturned() {
        OrderState order = OrderState.RETURNED;
        assertFalse(order.canDelete());
    }

}