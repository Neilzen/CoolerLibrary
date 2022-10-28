package core.config

import core.service.AccountService
import core.service.InvolvedPartyService
import core.service.impl.AccountServiceImpl
import core.service.impl.InvolvedPartyServiceImpl
import infrastructure.config.RepositoryConfig

class CoreConfig(val repositoryConfig: RepositoryConfig) {

    fun accountService(): AccountService {
        return AccountServiceImpl(involvedPartyService(), repositoryConfig.accountRepository())
    }

    fun involvedPartyService(): InvolvedPartyService {
        return InvolvedPartyServiceImpl(
            repositoryConfig.addressRepository(),
            repositoryConfig.electronicAddressRepository(),
            repositoryConfig.individualRepository(),
            repositoryConfig.involvedPartyRepository()
        )
    }

}