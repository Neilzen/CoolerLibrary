package local.staticdata.library

import infrastructure.library.entities.Transaction
import infrastructure.library.entities.TransactionHistory
import local.staticdata.AbstractStaticData

class TransactionHistoryData : AbstractStaticData<TransactionHistory>(storage = transactionHistoryStorage) {

    companion object {
        val transactionHistoryStorage: MutableMap<Int, TransactionHistory> = mutableMapOf()
    }

}