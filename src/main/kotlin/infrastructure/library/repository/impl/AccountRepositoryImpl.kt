package infrastructure.library.repository.impl

import infrastructure.common.repository.AbstractRepository
import infrastructure.library.entities.Account
import infrastructure.library.repository.AccountRepository
import local.staticdata.AbstractStaticData

class AccountRepositoryImpl(abstractStaticData: AbstractStaticData<Account>):
    AccountRepository, AbstractRepository<Account>(abstractStaticData) {
    override fun getAccount(id: Int): Account {
        TODO("Not yet implemented")
    }

    override fun addAccount(account: Account): Account {
        TODO("Not yet implemented")
    }

    override fun updateAccount(account: Account): Account {
        TODO("Not yet implemented")
    }
}