package infrastructure.individual.repository

import infrastructure.individual.entities.Individual
import infrastructure.individual.entities.InvolvedParty

interface InvolvedPartyRepository {

    fun addInvolvedParty(involvedParty: InvolvedParty): InvolvedParty
    fun getInvolvedParty(id: Int): InvolvedParty
    fun updateInvolvedParty(involvedParty: InvolvedParty): InvolvedParty

}