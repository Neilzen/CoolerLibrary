package local.staticdata

import infrastructure.individual.entities.Address
import local.staticdata.exception.StaticDataException
import local.staticdata.generator.SequenceGenerator
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.assertThrows
import java.time.LocalDateTime

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class AddressDataTest {

    val addressData = AddressData()
    val sequenceId = SequenceGenerator.generateAddressId()

    @Test
    fun testAddressLocalData() {
        val addressMap = AddressData.addressStorage
        assertEquals(3, addressMap.size)
        assertEquals("Brgy. Antipolo Del Norte", addressMap.get(1)!!.address1)
        assertEquals("Brgy. Pinagkawitan", addressMap.get(2)!!.address1)
        assertEquals("Brgy. Sabang", addressMap.get(3)!!.address1)
    }

    @Test
    fun persistAndGetData() {
        val address = Address(
            sequenceId,
            "Tester",
            null,
            null,
            LocalDateTime.now(),
            "Brgy. Anitpolo Del Sur",
            null,
            null,
            "Lipa City",
            "Batangas",
        )

        addressData.persist(address)
        val persistedAddress = addressData.get(sequenceId)
        assertEquals(sequenceId, persistedAddress.id)
        assertEquals("Brgy. Anitpolo Del Sur", persistedAddress.address1)
    }

    @Test
    fun removeData() {
        val address = addressData.get(1)
        assertEquals("Brgy. Antipolo Del Norte", address.address1)
        addressData.delete(1)
        assertThrows<StaticDataException> {
            addressData.get(1)
        }
    }

}