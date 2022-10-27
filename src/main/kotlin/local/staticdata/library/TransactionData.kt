package local.staticdata.library

import infrastructure.library.entities.Transaction
import local.staticdata.AbstractStaticData

class TransactionData: AbstractStaticData<Transaction>(storage = transactionStorage) {

    companion object {
        val transactionStorage: MutableMap<Int, Transaction> = mutableMapOf()
    }

}