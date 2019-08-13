package com.PetRock;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class MagicBuilderTest {
    @Test
    public void getLucky() {
        assertEquals(7, MagicBuilder.getLucky());
    }
}
