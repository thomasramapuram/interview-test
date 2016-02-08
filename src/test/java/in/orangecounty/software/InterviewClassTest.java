package in.orangecounty.software;

import static org.junit.Assert.*;

/**
 * Created by thomas on 08/02/16.
 */
public class InterviewClassTest {

    @org.junit.Test
    public void testCalculateThreeNPlusOne() throws Exception {
        InterviewClass ic = new InterviewClass();
        assertArrayEquals(new int[]{1, 10, 20}, ic.calculateThreeNPlusOne(1, 10));
        assertArrayEquals(new int[]{100, 200, 125}, ic.calculateThreeNPlusOne(100, 200));
        assertArrayEquals(new int[]{201, 210, 89}, ic.calculateThreeNPlusOne(201, 210));
        assertArrayEquals(new int[]{900, 1000, 174}, ic.calculateThreeNPlusOne(900, 1000));
    }
}