package infrastructure.library.entities

import core.enumeration.InventoryStatus
import infrastructure.common.entity.BaseEntity
import java.time.LocalDateTime

data class Inventory(
    override var id: Int = 0,
    override val createdBy: String = "",
    override var updatedBy: String?,
    override var updatedDateTime: LocalDateTime?,
    override val createdDateTime: LocalDateTime = LocalDateTime.now(),
    val book: Book,
    val quantity: Int,
    val status: InventoryStatus
): BaseEntity
