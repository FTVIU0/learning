package main.refactor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nlte on 2017/07/19 14:12.
 */
public class TTTest {
    String str = "aaa";
//    @Before
//    public void setUp() throws Exception {
//        str = "name";
//    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    @Test
    public void print() throws Exception {
        new TT("ad").print();
        assertEquals(0, 0);
    }

}