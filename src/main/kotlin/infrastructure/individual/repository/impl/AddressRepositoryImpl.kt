package infrastructure.individual.repository.impl

import infrastructure.common.repository.AbstractRepository
import infrastructure.individual.entities.Address
import infrastructure.individual.repository.AddressRepository
import local.staticdata.AbstractStaticData

class AddressRepositoryImpl(abstractStaticData: AbstractStaticData<Address>) :
    AddressRepository,
    AbstractRepository<Address>(abstractStaticData) {

    override fun addAddress(address: Address): Address {
        return super.persist(address)
    }

    override fun getAddress(id: Int): Address {
        return super.getEntity(id)
    }

    override fun updateAddress(address: Address): Address {
        return super.update(address)
    }
}