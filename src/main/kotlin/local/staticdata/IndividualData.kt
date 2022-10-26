package local.staticdata

import core.enumeration.Gender
import infrastructure.individual.entities.Address
import infrastructure.individual.entities.Individual
import local.staticdata.generator.SequenceGenerator
import java.time.LocalDateTime

class IndividualData: AbstractStaticData<Individual>(storage = individualStorage) {

    companion object {
        internal val individualA = Individual(
            SequenceGenerator.generateIndividualId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            "Neilzen Anthony",
            "De Torres",
            "Pua",
            Gender.MALE
        )
        internal val individualB = Individual(
            SequenceGenerator.generateIndividualId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            "Neil Anthony",
            "De Torres",
            "Pua",
            Gender.MALE
        )
        internal val individualC = Individual(
            SequenceGenerator.generateIndividualId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            "Roeschelle Anne",
            "De Torres",
            "Tiongson",
            Gender.FEMALE
        )

        val individualStorage: MutableMap<Int, Individual> = mutableMapOf(
            individualA.id to individualA,
            individualB.id to individualB,
            individualC.id to individualC,
        )
    }

}