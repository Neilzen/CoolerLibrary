package infrastructure.individual.entities

import core.enumeration.IndividualType
import infrastructure.common.entity.BaseEntity
import java.time.LocalDateTime

data class InvolvedParty(
    override var id: Int = 0,
    override val createdBy: String = "",
    override var updatedBy: String?,
    override var updatedDateTime: LocalDateTime?,
    override val createdDateTime: LocalDateTime = LocalDateTime.now(),
    val individual: Individual,
    val individualType: IndividualType,
    val currentAddress: Address,
    val postalAddress: Address?,
    val emailAddress: ElectronicAddress,
    val mobileNumber: ElectronicAddress
) : BaseEntity