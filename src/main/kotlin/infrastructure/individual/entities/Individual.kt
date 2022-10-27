package infrastructure.individual.entities

import core.enumeration.Gender
import infrastructure.common.entity.BaseEntity
import java.time.LocalDateTime

data class Individual(
    override var id: Int = 0,
    override val createdBy: String = "",
    override var updatedBy: String?,
    override var updatedDateTime: LocalDateTime?,
    override val createdDateTime: LocalDateTime = LocalDateTime.now(),
    val firstName: String,
    val lastName: String,
    val middleName: String,
    val gender: Gender,
) : BaseEntity
