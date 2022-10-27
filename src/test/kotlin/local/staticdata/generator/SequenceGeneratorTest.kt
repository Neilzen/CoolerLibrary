package local.staticdata.generator

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class SequenceGeneratorTest {

    @Test
    fun testGenerator() {
        assertEquals(1, SequenceGenerator.generateAddressId())
        assertEquals(2, SequenceGenerator.generateAddressId())
    }

}