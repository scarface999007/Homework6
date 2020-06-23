import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Homework6Test {
    private Homework6 homework6;


    @BeforeAll
    void init(){
        homework6 = new Homework6();
    }

    @Test
    void testAfterFour(){
        Assertions.assertEquals(Arrays.toString(new Integer[]{1, 7}), Arrays.toString(homework6.afterFourArray(new Integer[]{1, 2, 4, 4, 2, 3, 4, 1, 7})));
        Assertions.assertEquals(Arrays.toString(new Integer[]{3, 1, 7}), Arrays.toString(homework6.afterFourArray(new Integer[]{1, 2, 4, 4, 2, 4, 3, 1, 7})));
        Assertions.assertEquals(Arrays.toString(new Integer[]{2, 1, 1, 7}), Arrays.toString(homework6.afterFourArray(new Integer[]{1, 2, 4, 4, 4, 2, 1, 1, 7})));
        Assertions.assertEquals(Arrays.toString(new Integer[]{2, 3, 0, 1, 7}), Arrays.toString(homework6.afterFourArray(new Integer[]{1, 2, 4, 4, 2, 3, 0, 1, 7})));
    }

    @Test
    void testFindOneAndFour(){
        Assertions.assertTrue(homework6.findOneAndFour(new Integer[]{1, 4, 1, 1, 1, 1, 1, 1, 4}));
        Assertions.assertFalse(homework6.findOneAndFour(new Integer[]{1, 1, 1, 1, 1, 1, 1, 1, 1}));
        Assertions.assertFalse(homework6.findOneAndFour(new Integer[]{4, 4, 4}));
        Assertions.assertFalse(homework6.findOneAndFour(new Integer[]{4, 4, 4, 1, 3}));
    }
}

