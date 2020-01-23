package test;


import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void noBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("launchcode"));
    }

    @Test
    public void oneBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("launch[code"));
    }

    @Test
    public void twoBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void unorderedBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void nestedBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[]Code]"));
    }

}
