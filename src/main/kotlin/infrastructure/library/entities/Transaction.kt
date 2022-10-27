package infrastructure.library.entities

import core.enumeration.TransactionStatus
import infrastructure.common.entity.BaseEntity
import java.time.LocalDateTime

data class Transaction(
    override var id: Int = 0,
    override val createdBy: String = "",
    override var updatedBy: String?,
    override var updatedDateTime: LocalDateTime?,
    override val createdDateTime: LocalDateTime = LocalDateTime.now(),
    val book: Book,
    val customer: Account,
    val status: TransactionStatus
): BaseEntity
