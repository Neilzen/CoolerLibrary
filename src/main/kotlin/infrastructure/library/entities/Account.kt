package infrastructure.library.entities

import core.enumeration.AccountStatus
import infrastructure.common.entity.BaseEntity
import infrastructure.individual.entities.InvolvedParty
import java.time.LocalDateTime

data class Account(
    override val id: Int = 0,
    override val createdBy: String = "",
    override var updatedBy: String?,
    override var updatedDateTime: LocalDateTime?,
    override val createdDateTime: LocalDateTime = LocalDateTime.now(),
    val involvedParty: InvolvedParty,
    val accountStatus: AccountStatus,
): BaseEntity
