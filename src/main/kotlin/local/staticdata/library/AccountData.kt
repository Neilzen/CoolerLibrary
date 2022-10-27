package local.staticdata.library

import core.enumeration.AccountStatus
import core.enumeration.IndividualType
import infrastructure.library.entities.Account
import local.staticdata.AbstractStaticData
import local.staticdata.generator.SequenceGenerator
import local.staticdata.individual.InvolvedPartyData
import java.time.LocalDateTime

class AccountData: AbstractStaticData<Account>(storage = accountStorage) {

    companion object {
        val accountA = Account(
            SequenceGenerator.generateAccountId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            InvolvedPartyData.involvedPartyA,
            AccountStatus.ACTIVE,
            IndividualType.EMPLOYEE
        )
        val accountB = Account(
            SequenceGenerator.generateAccountId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            InvolvedPartyData.involvedPartyB,
            AccountStatus.ACTIVE,
            IndividualType.CUSTOMER
        )
        val accountC = Account(
            SequenceGenerator.generateAccountId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            InvolvedPartyData.involvedPartyC,
            AccountStatus.ACTIVE,
            IndividualType.CUSTOMER
        )
        val accountStorage: MutableMap<Int, Account> = mutableMapOf(
            accountA.id to accountA,
            accountB.id to accountB,
            accountC.id to accountC
        )
    }

}