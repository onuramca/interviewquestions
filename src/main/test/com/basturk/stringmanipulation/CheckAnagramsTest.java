package main.test.com.basturk.stringmanipulation;

import main.java.com.basturk.stringmanipulation.CheckAnagrams;

/**
 * Created by: onur
 * Date: 2/1/17
 */
public class CheckAnagramsTest extends junit.framework.TestCase {

    @org.junit.Test
    public void testIsAnagram() throws Exception {
        assertTrue(CheckAnagrams.isAnagram("word", "wrdo"));
        assertTrue(CheckAnagrams.isAnagram("mary", "army"));
        assertTrue(CheckAnagrams.isAnagram("stop", "tops"));
        assertTrue(CheckAnagrams.isAnagram("boat", "btoa"));
        assertFalse(CheckAnagrams.isAnagram("pure", "in"));
        assertFalse(CheckAnagrams.isAnagram("fill", "fil"));
        assertFalse(CheckAnagrams.isAnagram("b", "bbb"));
        assertFalse(CheckAnagrams.isAnagram("ccc", "ccccccc"));
        assertTrue(CheckAnagrams.isAnagram("a", "a"));
        assertFalse(CheckAnagrams.isAnagram("sleep", "slep"));
    }

    @org.junit.Test
    public void testIAnagram() throws Exception {
        assertTrue(CheckAnagrams.iAnagram("word", "wrdo"));
        assertTrue(CheckAnagrams.iAnagram("boat", "btoa"));
        assertFalse(CheckAnagrams.iAnagram("pure", "in"));
        assertFalse(CheckAnagrams.iAnagram("fill", "fil"));
        assertTrue(CheckAnagrams.iAnagram("a", "a"));
        assertFalse(CheckAnagrams.iAnagram("b", "bbb"));
        assertFalse(CheckAnagrams.iAnagram("ccc", "ccccccc"));
        assertFalse(CheckAnagrams.iAnagram("sleep", "slep"));
    }

    @org.junit.Test
    public void testCheckAnagram() throws Exception {
        assertTrue(CheckAnagrams.checkAnagram("word", "wrdo"));
        assertFalse(CheckAnagrams.checkAnagram("b", "bbb"));
        assertFalse(CheckAnagrams.checkAnagram("ccc", "ccccccc"));
        assertTrue(CheckAnagrams.checkAnagram("a", "a"));
        assertFalse(CheckAnagrams.checkAnagram("sleep", "slep"));
        assertTrue(CheckAnagrams.checkAnagram("boat", "btoa"));
        assertFalse(CheckAnagrams.checkAnagram("pure", "in"));
        assertFalse(CheckAnagrams.checkAnagram("fill", "fil"));
    }
}