package local.staticdata.individual

import infrastructure.individual.entities.Address
import local.staticdata.AbstractStaticData
import local.staticdata.generator.SequenceGenerator
import java.time.LocalDateTime

class AddressData: AbstractStaticData<Address>(storage = addressStorage) {

    companion object {
        internal val addressA = Address(
            SequenceGenerator.generateAddressId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            "Brgy. Antipolo Del Norte",
            null,
            null,
            "Lipa City",
            "Batangas"
        )
        internal val addressB = Address(
            SequenceGenerator.generateAddressId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            "Brgy. Pinagkawitan",
            null,
            null,
            "Lipa City",
            "Batangas"
        )
        internal val addressC = Address(
            SequenceGenerator.generateAddressId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            "Brgy. Sabang",
            null,
            null,
            "Lipa City",
            "Batangas"
        )

        var addressStorage: MutableMap<Int, Address> = mutableMapOf(
            addressA.id to addressA,
            addressB.id to addressB,
            addressC.id to addressC
        )
    }
}