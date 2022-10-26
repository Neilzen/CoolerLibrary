package infrastructure.library.entities

import infrastructure.common.entity.BaseEntity
import java.time.LocalDateTime

data class Catalog(
    override val id: Int = 0,
    override val createdBy: String = "",
    override var updatedBy: String?,
    override var updatedDateTime: LocalDateTime?,
    override val createdDateTime: LocalDateTime = LocalDateTime.now(),

): BaseEntity
