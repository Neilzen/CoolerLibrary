package core.converter

import api.dto.request.AccountDTO
import core.enumeration.ElectronicAddressType
import infrastructure.individual.entities.Address
import infrastructure.individual.entities.ElectronicAddress
import infrastructure.individual.entities.Individual
import infrastructure.individual.entities.InvolvedParty
import java.time.LocalDateTime

class AccountConverter {

    companion object {
        fun accountToInvolvedPartyEntity(accountDTO: AccountDTO): InvolvedParty {
            val address = mapAccountToAddress(accountDTO)
            val mobileNumber = mapAccountToMobile(accountDTO)
            val emailAddress = mapAccountToEmailAddress(accountDTO)
            val individual = mapAccountToIndividual(accountDTO)
            return InvolvedParty(
                0,
                "SystemTest",
                null,
                null,
                LocalDateTime.now(),
                individual,
                accountDTO.individualType,
                address,
                null,
                emailAddress,
                mobileNumber
            )
        }

        private fun mapAccountToAddress(accountDTO: AccountDTO): Address {
            return Address(
                accountDTO.id ?: 0,
                "SystemTest",
                null,
                null,
                LocalDateTime.now(),
                accountDTO.address1,
                accountDTO.address2,
                accountDTO.address3,
                accountDTO.municipality,
                accountDTO.province
            )
        }

        private fun mapAccountToMobile(accountDTO: AccountDTO): ElectronicAddress {
            return ElectronicAddress(
                0,
                "SystemTest",
                null,
                null,
                LocalDateTime.now(),
                accountDTO.mobileNumber,
                ElectronicAddressType.MOBILE
            )
        }

        private fun mapAccountToEmailAddress(accountDTO: AccountDTO): ElectronicAddress {
            return ElectronicAddress(
                0,
                "SystemTest",
                null,
                null,
                LocalDateTime.now(),
                accountDTO.emailAddress,
                ElectronicAddressType.MOBILE
            )
        }

        private fun mapAccountToIndividual(accountDTO: AccountDTO): Individual {
            return Individual(
                0,
                "SystemTest",
                null,
                null,
                LocalDateTime.now(),
                accountDTO.firstName,
                accountDTO.lastName,
                accountDTO.middleName,
                accountDTO.gender,
            )
        }
    }

}