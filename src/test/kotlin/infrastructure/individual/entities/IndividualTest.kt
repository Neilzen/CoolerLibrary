package infrastructure.individual.entities

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import util.IndividualDataGenerator

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class IndividualTest {

    @Test
    fun testGetterAndSetters() {
        val individual = IndividualDataGenerator.individualMale
        assertEquals(1, individual.id)
        assertEquals(IndividualDataGenerator.createdBy, individual.createdBy)
        assertEquals(IndividualDataGenerator.createdDateTime, individual.createdDateTime)
        assertNull(individual.updatedBy)
        assertNull(individual.updatedDateTime)
        assertEquals(IndividualDataGenerator.firstName, individual.firstName)
        assertEquals(IndividualDataGenerator.lastName, individual.lastName)
        assertEquals(IndividualDataGenerator.middleName, individual.middleName)
        assertEquals(IndividualDataGenerator.gender, individual.gender)
    }

}