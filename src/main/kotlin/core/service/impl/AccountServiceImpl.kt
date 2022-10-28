package core.service.impl

import api.dto.request.AccountDTO
import core.converter.AccountConverter
import core.enumeration.AccountStatus
import core.service.AccountService
import core.service.InvolvedPartyService
import infrastructure.individual.entities.InvolvedParty
import infrastructure.library.entities.Account
import infrastructure.library.repository.AccountRepository
import java.time.LocalDateTime

class AccountServiceImpl(
    private val involvedPartyService: InvolvedPartyService,
    private val accountRepository: AccountRepository
) : AccountService {

    override fun isEligible(id: Int): Boolean {
        return false
    }

    override fun addAccount(accountDTO: AccountDTO): AccountDTO {
        val involvedParty =
            involvedPartyService.addInvolvedParty(AccountConverter.accountToInvolvedPartyEntity(accountDTO))
        accountRepository.addAccount(mapAccountDtoToEntity(accountDTO, involvedParty))
        return accountDTO
    }

    override fun updateAccount(accountDTO: AccountDTO): AccountDTO {
        val involvedParty = AccountConverter.accountToInvolvedPartyEntity(accountDTO)
        involvedPartyService.updateInvolvedParty(involvedParty)
        accountRepository.updateAccount(mapAccountDtoToEntity(accountDTO, involvedParty))
        return accountDTO
    }

    override fun getAccount(id: Int): Account {
        return accountRepository.getAccount(id)
    }

    private fun mapAccountDtoToEntity(accountDTO: AccountDTO, involvedParty: InvolvedParty): Account {
        return Account(
            accountDTO.id ?: 0,
            "SystemTest",
            null,
            null,
            LocalDateTime.now(),
            involvedParty,
            AccountStatus.ACTIVE,
            accountDTO.individualType
        )
    }

}