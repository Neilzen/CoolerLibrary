package infrastructure.individual.repository.impl

import infrastructure.common.repository.AbstractRepository
import infrastructure.individual.entities.Address
import infrastructure.individual.entities.ElectronicAddress
import infrastructure.individual.repository.ElectronicAddressRepository
import local.staticdata.AbstractStaticData

class ElectronicAddressRepositoryImpl(
    abstractStaticData: AbstractStaticData<ElectronicAddress>
) : ElectronicAddressRepository, AbstractRepository<ElectronicAddress>(abstractStaticData) {
    override fun addElectronicAddress(electronicAddress: ElectronicAddress): ElectronicAddress {
        return super.persist(electronicAddress)
    }

    override fun getElectronicAddress(id: Int): ElectronicAddress {
        return super.getEntity(id)
    }

    override fun updateElectronicAddress(electronicAddress: ElectronicAddress): ElectronicAddress {
        return super.update(electronicAddress)
    }
}