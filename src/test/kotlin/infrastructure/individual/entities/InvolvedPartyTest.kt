package infrastructure.individual.entities

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import java.time.LocalDateTime

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class InvolvedPartyTest {

    @Test
    fun testSetterAndGetters() {
        val id = 1
        val createdBy = "CurrentTester"
        val createdDateTime = LocalDateTime.now()
    }

}