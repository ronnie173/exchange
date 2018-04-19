package bisq.desktop.util.validation;

import bisq.core.locale.Res;

import java.util.Locale;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AccountNrValidatorTest {

    @Before
    public void setup() {
        Locale.setDefault(new Locale("en", "US"));
        Res.setBaseCurrencyCode("BTC");
        Res.setBaseCurrencyName("Bitcoin");
    }

    @Test
    public void testValidationForArgentina() {
        AccountNrValidator validator = new AccountNrValidator("AR");

        assertTrue(validator.validate("4009041813520").isValid);
        assertFalse(validator.validate("40090418135201").isValid);
    }
}
