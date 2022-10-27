package infrastructure.individual.repository.impl

import infrastructure.common.repository.AbstractRepository
import infrastructure.individual.entities.InvolvedParty
import infrastructure.individual.repository.AddressRepository
import infrastructure.individual.repository.ElectronicAddressRepository
import infrastructure.individual.repository.IndividualRepository
import infrastructure.individual.repository.InvolvedPartyRepository
import local.staticdata.AbstractStaticData

class InvolvedPartyRepositoryImpl(
    private val addressRepository: AddressRepository,
    private val electronicAddressRepository: ElectronicAddressRepository,
    private val individualRepository: IndividualRepository,
    private val abstractStaticData: AbstractStaticData<InvolvedParty>,
) : InvolvedPartyRepository, AbstractRepository<InvolvedParty>(abstractStaticData) {

    override fun addInvolvedParty(involvedParty: InvolvedParty): InvolvedParty {
        addressRepository.addAddress(involvedParty.currentAddress)
        electronicAddressRepository.addElectronicAddress(involvedParty.emailAddress)
        electronicAddressRepository.addElectronicAddress(involvedParty.mobileNumber)
        individualRepository.addIndividual(involvedParty.individual)
        return super.persist(involvedParty)
    }

    override fun getInvolvedParty(id: Int): InvolvedParty {
        return super.getEntity(id)
    }

    override fun updateInvolvedParty(involvedParty: InvolvedParty): InvolvedParty {
        return super.persist(involvedParty)
    }
}