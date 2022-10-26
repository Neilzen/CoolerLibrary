package infrastructure.library.entities

import core.enumeration.TransactionType
import infrastructure.common.entity.BaseEntity
import java.time.LocalDateTime

data class TransactionHistory(
    override val id: Int = 0,
    override val createdBy: String = "",
    override var updatedBy: String?,
    override var updatedDateTime: LocalDateTime?,
    override val createdDateTime: LocalDateTime = LocalDateTime.now(),
    val employee: Account,
    val status: TransactionType,
    val transaction: Transaction,
): BaseEntity
