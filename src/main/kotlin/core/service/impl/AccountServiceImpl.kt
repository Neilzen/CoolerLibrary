package core.service.impl

import api.dto.request.AccountDTO
import core.converter.AccountConverter
import core.enumeration.AccountStatus
import core.service.AccountService
import core.service.InvolvedPartyService
import infrastructure.individual.entities.InvolvedParty
import infrastructure.individual.repository.AddressRepository
import infrastructure.individual.repository.ElectronicAddressRepository
import infrastructure.individual.repository.IndividualRepository
import infrastructure.individual.repository.InvolvedPartyRepository
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
        val involvedParty = involvedPartyService.addInvolvedParty(AccountConverter.accountToInvolvedPartyEntity(accountDTO))
        accountRepository.addAccount(initializeAccountEntity(accountDTO, involvedParty))
        return accountDTO
    }

    override fun updateAccount(accountDTO: AccountDTO): Boolean {
        TODO("Not yet implemented")
    }

    override fun getAccount(id: Int): Account {
        TODO("Not yet implemented")
    }

    private fun initializeAccountEntity(accountDTO: AccountDTO, involvedParty: InvolvedParty): Account {
        return Account(
            0,
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