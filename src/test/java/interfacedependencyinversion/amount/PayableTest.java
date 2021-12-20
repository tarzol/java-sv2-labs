package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {

    @Test
    void testAmount() {
        Payable amount = new Amount();
        assertEquals(2000, amount.getPayableAmount(2000));
    }

    @Test
    void testCash() {
        Payable cash = new Cash();
        assertEquals(2010, cash.getPayableAmount(2011));
        assertEquals(2015, cash.getPayableAmount(2013));
        assertEquals(2015, cash.getPayableAmount(2015));
        assertEquals(2015, cash.getPayableAmount(2016));
        assertEquals(2020, cash.getPayableAmount(2018));
        assertEquals(2020, cash.getPayableAmount(2019));
    }

    @Test
    void testBankATM() {
        Payable bankATM = new BankAtm();
        assertEquals(2000, bankATM.getPayableAmount(2000));
        assertEquals(3000, bankATM.getPayableAmount(2001));
    }

}