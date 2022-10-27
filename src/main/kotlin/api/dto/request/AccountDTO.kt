package api.dto.request

import api.dto.BaseDTO
import core.enumeration.Gender
import core.enumeration.IndividualType
import infrastructure.common.entity.BaseEntity

data class AccountDTO(
    val firstName: String,
    val lastName: String,
    val middleName: String,
    val gender: Gender,
    val address1: String,
    val address2: String?,
    val address3: String?,
    val municipality: String,
    val province: String,
    val mobileNumber: String,
    val emailAddress: String,
    val individualType: IndividualType
)