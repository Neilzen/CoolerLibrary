package infrastructure.individual.repository

import infrastructure.individual.entities.Address
import infrastructure.individual.entities.ElectronicAddress

interface ElectronicAddressRepository {

    fun addElectronicAddress(electronicAddress: ElectronicAddress): ElectronicAddress
    fun getElectronicAddress(id: Int): Address
    fun updateElectronicAddress(electronicAddress: ElectronicAddress): ElectronicAddress

}