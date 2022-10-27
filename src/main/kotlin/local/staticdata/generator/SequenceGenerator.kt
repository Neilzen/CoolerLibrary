package local.staticdata.generator

import infrastructure.common.entity.BaseEntity
import infrastructure.individual.entities.Address
import infrastructure.individual.entities.ElectronicAddress
import infrastructure.individual.entities.Individual
import infrastructure.individual.entities.InvolvedParty
import infrastructure.library.entities.*
import local.staticdata.exception.StaticDataException

class SequenceGenerator {

    companion object {
        private var addressId = 0
        private var electronicAddressId = 0
        private var individualId = 0
        private var involvedPartyId = 0
        private var accountId = 0
        private var authorId = 0
        private var bookId = 0
        private var inventoryId = 0
        private var transactionId = 0
        private var transactionHistoryId = 0

        internal fun generateAddressId(): Int {
            addressId++
            return addressId
        }

        internal fun generateElectronicAddressId(): Int {
            electronicAddressId++
            return electronicAddressId
        }

        internal fun generateIndividualId(): Int {
            individualId++
            return individualId
        }

        internal fun generateInvolvedPartyId(): Int {
            involvedPartyId++
            return involvedPartyId
        }

        internal fun generateAccountId(): Int {
            accountId++
            return accountId
        }

        internal fun generateAuthorId(): Int {
            authorId++
            return authorId
        }

        internal fun generateBookId(): Int {
            bookId++
            return bookId
        }

        internal fun generateInventoryId(): Int {
            inventoryId++
            return inventoryId
        }

        internal fun generateTransactionId(): Int {
            transactionId++
            return transactionId
        }

        internal fun generateTransactionHistoryId(): Int {
            transactionHistoryId++
            return transactionHistoryId
        }

        internal fun generateIdSequence(data: Any) {
            when(data) {
                is Address -> data.id = generateAddressId()
                is ElectronicAddress -> data.id = generateElectronicAddressId()
                is Individual -> data.id = generateIndividualId()
                is InvolvedParty -> data.id = generateInvolvedPartyId()
                is Account -> data.id = generateAccountId()
                is Author -> data.id = generateAuthorId()
                is Book -> data.id = generateBookId()
                is Inventory -> data.id = generateInventoryId()
                is Transaction -> data.id = generateTransactionId()
                is TransactionHistory -> data.id = generateTransactionHistoryId()
                else -> throw StaticDataException("Data Type is not specified in Sequence Generator for ${data.javaClass.name}")
            }
        }
    }
}