package infrastructure.library.repository

import infrastructure.library.entities.Account

interface AccountRepository {

    fun getAccount(id: Int): Account
    fun addAccount(account: Account): Account
    fun updateAccount(account: Account): Account


}