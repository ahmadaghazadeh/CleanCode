package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    public AppTest() {
    }

    @Test
    public void testSimpleDoublePresent() throws Exception {
        Args args = new Args("x##", new String[] { "-x", "42.3" });
        assertTrue(args.isValid());
        assertEquals(1, args.cardinality());
        assertTrue(args.has('x'));
        assertEquals(42.3, args.getDouble('x'), .001);
    }

    @Test
    public void testSimpleIntegerPresent() throws Exception {
        Args args = new Args("i#", new String[] { "-i", "42" });
        assertTrue(args.isValid());
        assertEquals(1, args.cardinality());
        assertTrue(args.has('i'));
        assertEquals(42, args.getInt('i'));
    }

    @Test
    public void testSimpleStringPresent() throws Exception {
        Args args = new Args("s*", new String[] { "-s", "Ahmad" });
        assertTrue(args.isValid());
        assertEquals(1, args.cardinality());
        assertTrue(args.has('s'));
        assertEquals("Ahmad", args.getString('s'));
    }

    @Test
    public void testSimpleBooleanPresent() throws Exception {
        Args args = new Args("b", new String[] { "-b", "true" });
        assertTrue(args.isValid());
        assertEquals(1, args.cardinality());
        assertTrue(args.has('b'));
        assertEquals(true, args.getBoolean('b'));
    }

}
