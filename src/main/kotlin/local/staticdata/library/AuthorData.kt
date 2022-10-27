package local.staticdata.library

import infrastructure.library.entities.Author
import local.staticdata.AbstractStaticData
import local.staticdata.generator.SequenceGenerator
import java.time.LocalDateTime

class AuthorData: AbstractStaticData<Author>(storage = authorStorage) {

    companion object {
        internal val authorA = Author(
            SequenceGenerator.generateAuthorId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            "Stephen Spielberg",
            LocalDateTime.parse("1992-01-30T08:00:00.000")
        )
        internal val authorB = Author(
            SequenceGenerator.generateAuthorId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            "Maria Carey",
            LocalDateTime.parse("1985-11-25T08:00:00.000")
        )
        internal val authorC = Author(
            SequenceGenerator.generateAuthorId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            "Edifier Mosley",
            LocalDateTime.parse("1955-12-15T08:00:00.000")
        )
        internal val authorD = Author(
            SequenceGenerator.generateAuthorId(),
            "LocalTest",
            null,
            null,
            LocalDateTime.now(),
            "Mike Morales",
            LocalDateTime.parse("1990-01-05T08:00:00.000")
        )
        val authorStorage: MutableMap<Int, Author> = mutableMapOf(
            authorA.id to authorA,
            authorB.id to authorB,
            authorC.id to authorC,
            authorD.id to authorD,
        )
    }

}