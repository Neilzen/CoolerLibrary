package local.staticdata.generator

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

        fun generateAddressId(): Int {
            addressId++
            return addressId
        }

        fun generateElectronicAddressId(): Int {
            electronicAddressId++
            return electronicAddressId
        }

        fun generateIndividualId(): Int {
            individualId++
            return individualId
        }

        fun generateInvolvedPartyId(): Int {
            involvedPartyId++
            return involvedPartyId
        }

        fun generateAccountId(): Int {
            accountId++
            return accountId
        }

        fun generateAuthorId(): Int {
            authorId++
            return authorId
        }

        fun generateBookId(): Int {
            bookId++
            return bookId
        }

        fun generateInventoryId(): Int {
            inventoryId++
            return inventoryId
        }

        fun generateTransactionId(): Int {
            transactionId++
            return transactionId
        }

        fun generateTransactionHistoryId(): Int {
            transactionHistoryId++
            return transactionHistoryId
        }
    }
}