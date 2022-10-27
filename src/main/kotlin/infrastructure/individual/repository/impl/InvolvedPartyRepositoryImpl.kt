package infrastructure.individual.repository.impl

import infrastructure.individual.entities.InvolvedParty
import infrastructure.individual.repository.AddressRepository
import infrastructure.individual.repository.ElectronicAddressRepository
import infrastructure.individual.repository.IndividualRepository
import infrastructure.individual.repository.InvolvedPartyRepository

class InvolvedPartyRepositoryImpl(
    private val addressRepository: AddressRepository,
    private val electronicAddressRepository: ElectronicAddressRepository,
    private val individualRepository: IndividualRepository,
    private val involvedPartyRepository: InvolvedPartyRepository,
) : InvolvedPartyRepository {

    override fun addInvolvedParty(involvedParty: InvolvedParty): InvolvedParty {
        addressRepository.addAddress(involvedParty.currentAddress)
        electronicAddressRepository.addElectronicAddress(involvedParty.emailAddress)
        electronicAddressRepository.addElectronicAddress(involvedParty.mobileNumber)
        individualRepository.addIndividual(involvedParty.individual)
        return involvedPartyRepository.addInvolvedParty(involvedParty)
    }

    override fun getInvolvedParty(id: Int): InvolvedParty {
        TODO("Not yet implemented")
    }

    override fun updateInvolvedParty(involvedParty: InvolvedParty): InvolvedParty {
        TODO("Not yet implemented")
    }
}