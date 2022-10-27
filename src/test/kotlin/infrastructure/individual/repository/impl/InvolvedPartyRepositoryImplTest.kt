package infrastructure.individual.repository.impl

import infrastructure.config.RepositoryConfig
import infrastructure.individual.repository.InvolvedPartyRepository
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class InvolvedPartyRepositoryImplTest() {

    private var involvedPartyRepository: InvolvedPartyRepository = RepositoryConfig().involvedPartyRepository()

    @BeforeAll
    fun config() {
        involvedPartyRepository = RepositoryConfig().involvedPartyRepository()
    }

    @Test
    fun testGetter() {
        assertNotNull(involvedPartyRepository.getInvolvedParty(1))
    }

}