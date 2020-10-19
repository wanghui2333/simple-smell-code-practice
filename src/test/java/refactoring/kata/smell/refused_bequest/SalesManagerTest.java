package refactoring.kata.smell.refused_bequest;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SalesManagerTest {
    @Test
    public void should_have_quota_less_than_5000() {
        SalesManager manager = new SalesManager();

        assertTrue(manager.hasSalesQuota(2000));
        assertFalse(manager.hasSalesQuota(5000));
        assertFalse(manager.hasSalesQuota(5001));
    }

}
