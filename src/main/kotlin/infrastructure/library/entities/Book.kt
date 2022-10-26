package infrastructure.library.entities

import core.enumeration.BookGenre
import infrastructure.common.entity.BaseEntity
import java.time.LocalDateTime

data class Book(
    override val id: Int = 0,
    override val createdBy: String = "",
    override var updatedBy: String?,
    override var updatedDateTime: LocalDateTime?,
    override val createdDateTime: LocalDateTime = LocalDateTime.now(),
    val name: String,
    val genre: BookGenre,
    val overview: String,
    val author: Author,
): BaseEntity
