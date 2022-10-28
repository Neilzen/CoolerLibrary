package core.service

import infrastructure.individual.entities.InvolvedParty

interface InvolvedPartyService {

    fun addInvolvedParty(involvedParty: InvolvedParty): InvolvedParty
    fun updateInvolvedParty(involvedParty: InvolvedParty): InvolvedParty

}