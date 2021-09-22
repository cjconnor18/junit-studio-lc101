package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testEmptyString() {
        assertEquals(BalancedBrackets.hasBalancedBrackets(""), true);
    }

    @Test
    public void testBracketsOnly() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("[]"), true);
    }

    @Test
    public void testBracketsReversedOnly() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("]["), false);
    }

    @Test
    public void testOneBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void testTrueCase1() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void testTrueCase2() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[code]"));
    }

    @Test
    public void testTrueCase3() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void testFalseCase() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void otherMismatchReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]launch[]"));
    }



}
