package core.service

import api.dto.request.AccountDTO
import infrastructure.library.entities.Account

interface AccountService {

     fun isEligible(id: Int): Boolean
     fun addAccount(accountDTO: AccountDTO): AccountDTO
     fun updateAccount(accountDTO: AccountDTO): Boolean
     fun getAccount(id: Int): Account

}