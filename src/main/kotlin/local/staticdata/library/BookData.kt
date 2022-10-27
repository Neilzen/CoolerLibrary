package local.staticdata.library

import core.enumeration.BookGenre
import infrastructure.library.entities.Book
import local.staticdata.AbstractStaticData
import local.staticdata.generator.SequenceGenerator
import java.time.LocalDateTime

class BookData: AbstractStaticData<Book>(storage = bookStorage) {

    companion object {
        internal val bookA = Book(
            SequenceGenerator.generateBookId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            "Members Book",
            BookGenre.FICTION.ACTIONANDADVENTURE,
            null,
            "Member",
            AuthorData.authorA,
        )
        internal val bookB = Book(
            SequenceGenerator.generateBookId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            "Marvel Book",
            BookGenre.FICTION.COMICBOOK,
            null,
            "Marvel",
            AuthorData.authorA,
        )
        internal val bookC = Book(
            SequenceGenerator.generateBookId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            "DC Book",
            BookGenre.FICTION.COMICBOOK,
            null,
            "DC",
            AuthorData.authorB,
        )
        internal val bookD = Book(
            SequenceGenerator.generateBookId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            "Lovers Book",
            null,
            BookGenre.NONFICTION.AUTOBIOGRAPHY,
            "Love Sotry",
            AuthorData.authorC,
        )
        internal val bookE = Book(
            SequenceGenerator.generateBookId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            "War Story",
            null,
            BookGenre.NONFICTION.ART,
            "War",
            AuthorData.authorB,
        )
        val bookStorage: MutableMap<Int, Book> = mutableMapOf(
            bookA.id to bookA,
            bookB.id to bookB,
            bookC.id to bookC,
            bookD.id to bookD,
            bookE.id to bookE
        )
    }

}