package local.staticdata.individual

import core.enumeration.ElectronicAddressType
import infrastructure.individual.entities.ElectronicAddress
import local.staticdata.AbstractStaticData
import local.staticdata.generator.SequenceGenerator
import java.time.LocalDateTime

class ElectronicAddressData: AbstractStaticData<ElectronicAddress>(storage = electronicAddressStorage) {

    companion object {
        internal val electronicAddressAMobile = ElectronicAddress(
            SequenceGenerator.generateAddressId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            "+639175044196",
            ElectronicAddressType.MOBILE
        )
        internal val electronicAddressAEmail = ElectronicAddress(
            SequenceGenerator.generateAddressId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            "neilzen.detorres@advancegroup.com",
            ElectronicAddressType.MOBILE
        )
        internal val electronicAddressBMobile = ElectronicAddress(
            SequenceGenerator.generateAddressId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            "+639175148769",
            ElectronicAddressType.MOBILE
        )
        internal val electronicAddressBEmail = ElectronicAddress(
            SequenceGenerator.generateAddressId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            "neil.detorres@advancegroup.com",
            ElectronicAddressType.MOBILE
        )
        internal val electronicAddressCMobile = ElectronicAddress(
            SequenceGenerator.generateAddressId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            "+639175143324",
            ElectronicAddressType.MOBILE
        )
        internal val electronicAddressCEmail = ElectronicAddress(
            SequenceGenerator.generateAddressId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            "roe.detorres@advancegroup.com",
            ElectronicAddressType.MOBILE
        )

        val electronicAddressStorage: MutableMap<Int, ElectronicAddress> = mutableMapOf(
            electronicAddressAMobile.id to electronicAddressAMobile,
            electronicAddressAEmail.id to electronicAddressAEmail,
            electronicAddressBMobile.id to electronicAddressBMobile,
            electronicAddressBEmail.id to electronicAddressBEmail,
            electronicAddressCMobile.id to electronicAddressCMobile,
            electronicAddressCEmail.id to electronicAddressCEmail,
        )
    }

}