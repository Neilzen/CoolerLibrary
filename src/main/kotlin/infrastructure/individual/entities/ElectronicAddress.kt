package infrastructure.individual.entities

import core.enumeration.ElectronicAddressType
import infrastructure.common.entity.BaseEntity
import java.time.LocalDateTime

data class ElectronicAddress(
    override var id: Int = 0,
    override val createdBy: String = "",
    override var updatedBy: String?,
    override var updatedDateTime: LocalDateTime?,
    override val createdDateTime: LocalDateTime = LocalDateTime.now(),
    val address: String,
    val addressType: ElectronicAddressType
) : BaseEntity