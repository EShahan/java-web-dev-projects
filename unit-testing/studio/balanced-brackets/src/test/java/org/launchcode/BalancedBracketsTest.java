package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
 * The function BalancedBrackets should return true if and only if
 * the input string has a set of "balanced" brackets.
 *
 * That is, whether it consists entirely of pairs of opening/closing
 * brackets (in that order), none of which mis-nest. We consider a bracket
 * to be square-brackets: [ or ].
 *
 * The string may contain non-bracket characters as well.
 *
 * These strings have balanced brackets:
 *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
 *
 * While these do not:
 *   "[LaunchCode", "Launch]Code[", "[", "]["
 *
 * @param str - to be validated
 * @return true if balanced, false otherwise
 */

class BalancedBracketsTest {
    //TODO: add tests here


    @Test
    //1
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    //2
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    //3
    public void stringInsideBracketsIsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[This is a string]");
    }

    @Test
    //4
    public void stringInMiddleOfBracketsIsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[This] is a string"));
    }

    @Test
    //5
    public void bracketLessStringIsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("This is a string"));
    }

    @Test
    //6
    public void singleOpeningBracketInStringIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[This is a string"));
    }

    @Test
    //7
    public void singleClosingBracketIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBracket("This is a strring]"));
    }

    @Test
    //8
    public void bracketsInWrongOrderIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]This[ is a string"));
    }

    @Test
    //9
    public void onlyOpeningBracketIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    //10
    public void onlyClosingBracketIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    //11
    public void lotsOfUnevenOpeningBracketsIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[This [is] a string"));
    }

    @Test
    //12
    public void lotsOfUnevenClosingBracketsIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[This] is] a string"));
    }

    @Test
    //13
    public void lotsOfBracketsInWrongOrderIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]This [is] a ]string["));
    }

    @Test
    //14
    public void bracketsInRightOrderThenInWrongOrderIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[This] is a ]string["));
    }
}