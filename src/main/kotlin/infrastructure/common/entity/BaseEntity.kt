package infrastructure.common.entity

import java.time.LocalDateTime

interface BaseEntity{
    val id: Int
    val createdBy: String
    var updatedBy: String?
    var updatedDateTime: LocalDateTime?
    val createdDateTime: LocalDateTime
}
