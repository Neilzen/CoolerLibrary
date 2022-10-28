package core.service.impl

import core.service.InvolvedPartyService
import infrastructure.common.entity.BaseEntity
import infrastructure.individual.entities.Address
import infrastructure.individual.entities.ElectronicAddress
import infrastructure.individual.entities.InvolvedParty
import infrastructure.individual.repository.AddressRepository
import infrastructure.individual.repository.ElectronicAddressRepository
import infrastructure.individual.repository.IndividualRepository
import infrastructure.individual.repository.InvolvedPartyRepository
import java.time.LocalDateTime

class InvolvedPartyServiceImpl(
    private val addressRepository: AddressRepository,
    private val electronicAddressRepository: ElectronicAddressRepository,
    private val individualRepository: IndividualRepository,
    private val involvedPartyRepository: InvolvedPartyRepository
): InvolvedPartyService {
    override fun addInvolvedParty(involvedParty: InvolvedParty): InvolvedParty {
        persistAddress(involvedParty.currentAddress, involvedParty.postalAddress)
        persistElectronicAddress(involvedParty.mobileNumber, involvedParty.emailAddress)
        individualRepository.addIndividual(involvedParty.individual)
        return involvedPartyRepository.addInvolvedParty(involvedParty)
    }

    override fun updateInvolvedParty(involvedParty: InvolvedParty): InvolvedParty {
        updateAddress(involvedParty.currentAddress, involvedParty.postalAddress)
        updateElectronicAddress(involvedParty.mobileNumber, involvedParty.emailAddress)
        individualRepository.updateIndividual(involvedParty.individual)
        return involvedPartyRepository.updateInvolvedParty(involvedParty)
    }

    private fun persistAddress(currentAddress: Address, postalAddress: Address?) {
        addressRepository.addAddress(currentAddress)
        if(postalAddress != null) addressRepository.addAddress(postalAddress)
    }

    private fun updateAddress(currentAddress: Address, postalAddress: Address?) {
        addressRepository.updateAddress(currentAddress)
        if(postalAddress != null) addressRepository.updateAddress(postalAddress)
    }

    private fun persistElectronicAddress(mobileNumber: ElectronicAddress, emailAddress: ElectronicAddress) {
        electronicAddressRepository.addElectronicAddress(mobileNumber)
        electronicAddressRepository.addElectronicAddress(emailAddress)
    }

    private fun updateElectronicAddress(mobileNumber: ElectronicAddress, emailAddress: ElectronicAddress) {
        electronicAddressRepository.updateElectronicAddress(mobileNumber)
        electronicAddressRepository.updateElectronicAddress(emailAddress)
    }
}