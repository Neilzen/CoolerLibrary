package infrastructure.individual.repository

import infrastructure.common.entity.BaseEntity
import infrastructure.common.repository.AbstractRepository
import infrastructure.individual.entities.Address

interface AddressRepository {

    fun addAddress(address: Address): Address
    fun getAddress(id: Int): Address
    fun updateAddress(address: Address): Address

}