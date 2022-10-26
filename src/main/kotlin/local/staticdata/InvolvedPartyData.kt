package local.staticdata

import core.enumeration.IndividualType
import infrastructure.individual.entities.InvolvedParty
import local.staticdata.generator.SequenceGenerator
import java.time.LocalDateTime

class InvolvedPartyData: AbstractStaticData<InvolvedParty>(storage = involvedPartyStorage) {

    companion object {

        private val involvedPartyA = InvolvedParty(
            SequenceGenerator.generateInvolvedPartyId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            IndividualData.individualA,
            IndividualType.EMPLOYEE,
            AddressData.addressA,
            null,
            ElectronicAddressData.electronicAddressAEmail,
            ElectronicAddressData.electronicAddressAMobile
        )
        private val involvedPartyB = InvolvedParty(
            SequenceGenerator.generateInvolvedPartyId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            IndividualData.individualB,
            IndividualType.CUSTOMER,
            AddressData.addressB,
            null,
            ElectronicAddressData.electronicAddressBEmail,
            ElectronicAddressData.electronicAddressBMobile
        )
        private val involvedPartyC = InvolvedParty(
            SequenceGenerator.generateInvolvedPartyId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            IndividualData.individualC,
            IndividualType.CUSTOMER,
            AddressData.addressC,
            null,
            ElectronicAddressData.electronicAddressCEmail,
            ElectronicAddressData.electronicAddressCMobile
        )

        val involvedPartyStorage: MutableMap<Int, InvolvedParty> = mutableMapOf(
            involvedPartyA.id to involvedPartyA,
            involvedPartyB.id to involvedPartyB,
            involvedPartyC.id to involvedPartyC
        )

    }


}