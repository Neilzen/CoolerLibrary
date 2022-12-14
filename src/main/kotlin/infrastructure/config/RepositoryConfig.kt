package infrastructure.config

import infrastructure.individual.repository.AddressRepository
import infrastructure.individual.repository.ElectronicAddressRepository
import infrastructure.individual.repository.IndividualRepository
import infrastructure.individual.repository.InvolvedPartyRepository
import infrastructure.individual.repository.impl.AddressRepositoryImpl
import infrastructure.individual.repository.impl.ElectronicAddressRepositoryImpl
import infrastructure.individual.repository.impl.IndividualRepositoryImpl
import infrastructure.individual.repository.impl.InvolvedPartyRepositoryImpl
import infrastructure.library.repository.AccountRepository
import infrastructure.library.repository.impl.AccountRepositoryImpl
import local.staticdata.individual.AddressData
import local.staticdata.individual.ElectronicAddressData
import local.staticdata.individual.IndividualData
import local.staticdata.individual.InvolvedPartyData
import local.staticdata.library.AccountData

class RepositoryConfig {

    fun addressRepository(): AddressRepository {
        return AddressRepositoryImpl(AddressData())
    }

    fun electronicAddressRepository(): ElectronicAddressRepository {
        return ElectronicAddressRepositoryImpl(ElectronicAddressData())
    }

    fun individualRepository(): IndividualRepository {
        return IndividualRepositoryImpl(IndividualData())
    }

    fun involvedPartyRepository(): InvolvedPartyRepository {
        return InvolvedPartyRepositoryImpl(
            addressRepository(),
            electronicAddressRepository(),
            individualRepository(),
            InvolvedPartyData())
    }

    fun accountRepository(): AccountRepository {
        return AccountRepositoryImpl(AccountData())
    }

}