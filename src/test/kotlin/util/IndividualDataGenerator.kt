package util

import core.enumeration.Gender
import infrastructure.individual.entities.Individual
import java.time.LocalDateTime

class IndividualDataGenerator {
    companion object Factory {
        val createdBy: String = "CurrentTest"
        val createdDateTime: LocalDateTime = LocalDateTime.now()
        val firstName: String = "Customer One"
        val lastName: String = "De Torres"
        val middleName: String = "Pua"
        val gender = Gender.MALE
        val individualMale = Individual(
            1,
            createdBy,
            null,
            null,
            createdDateTime,
            firstName,
            lastName,
            middleName,
            gender,
        )
    }

}