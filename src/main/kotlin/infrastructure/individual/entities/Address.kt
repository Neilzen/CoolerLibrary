package infrastructure.individual.entities

import infrastructure.common.entity.BaseEntity
import java.time.LocalDateTime

data class Address (
    override val id: Int = 0,
    override val createdBy: String = "",
    override var updatedBy: String?,
    override var updatedDateTime: LocalDateTime?,
    override val createdDateTime: LocalDateTime = LocalDateTime.now(),
    val address1: String,
    val address2: String?,
    val address3: String?,
    val municipality: String,
    val province: String
): BaseEntity