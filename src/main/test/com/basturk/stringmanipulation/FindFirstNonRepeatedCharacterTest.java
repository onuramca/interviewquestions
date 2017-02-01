package main.test.com.basturk.stringmanipulation;

import main.java.com.basturk.stringmanipulation.FindFirstNonRepeatedCharacter;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by: onur
 * Date: 2/1/17
 */
public class FindFirstNonRepeatedCharacterTest {

    @Test
    public void testGetFirstNonRepeatedChar() throws Exception {
        Assert.assertEquals('b', FindFirstNonRepeatedCharacter.getFirstNonRepeatedChar("abcdefghija"));
        assertEquals('h', FindFirstNonRepeatedCharacter.getFirstNonRepeatedChar("hello"));
        assertEquals('J', FindFirstNonRepeatedCharacter.getFirstNonRepeatedChar("Java"));
        assertEquals('i', FindFirstNonRepeatedCharacter.getFirstNonRepeatedChar("simplest"));
    }

    @Test
    public void testFirstNonRepeatingChar() throws Exception {
        assertEquals('b', FindFirstNonRepeatedCharacter.firstNonRepeatingChar("abcdefghija"));
        assertEquals('h', FindFirstNonRepeatedCharacter.firstNonRepeatingChar("hello"));
        assertEquals('J', FindFirstNonRepeatedCharacter.firstNonRepeatingChar("Java"));
        assertEquals('i', FindFirstNonRepeatedCharacter.firstNonRepeatingChar("simplest"));
    }

    @Test
    public void testFirstNonRepeatedCharacter() throws Exception {
        assertEquals('b', FindFirstNonRepeatedCharacter.firstNonRepeatedCharacter("abcdefghija"));
        assertEquals('h', FindFirstNonRepeatedCharacter.firstNonRepeatedCharacter("hello"));
        assertEquals('J', FindFirstNonRepeatedCharacter.firstNonRepeatedCharacter("Java"));
        assertEquals('i', FindFirstNonRepeatedCharacter.firstNonRepeatedCharacter("simplest"));
    }
}