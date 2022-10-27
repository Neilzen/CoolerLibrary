package local.staticdata

import infrastructure.common.entity.BaseEntity
import local.staticdata.exception.StaticDataException
import local.staticdata.generator.SequenceGenerator

abstract class AbstractStaticData<E : BaseEntity>(var storage: MutableMap<Int, E>) {

    @Throws()
    fun get(id: Int): E {
        checkIfDataExist(id)
        val obj = this.storage.getValue(id)
        println("Retrieved: $obj")
        return this.storage.getValue(id)
    }

    fun delete(id: Int) {
        checkIfDataExist(id)
        println("Deleting data based on ID $id")
        this.storage.remove(id)
    }

    fun getAll(): List<E> {
        println("Retrieving all Data")
        return ArrayList(this.storage.values)
    }

    fun deleteAll() {
        println("Deleting all data")
        storage = mutableMapOf()
    }

    fun persistAll(objectList: List<E>): List<E> {
        println("Persisting all data: $objectList")
        for (objectValue in objectList) {
            persist(objectValue)
        }
        return objectList
    }

    fun persist(data: E): E {
        println("Persisting data: $data")
        if(idPresent(data)) generateIdSequence(data)
        storage[data.id] = data
        return data
    }

    private fun checkIfDataExist(id: Int) {
        if (!storage.containsKey(id)) {
            println("Data does not exist for $id")
            throw StaticDataException("Entry does not exist")
        }
    }

    private fun generateIdSequence(data: E) {
        SequenceGenerator.generateIdSequence(data)
    }

    private fun idPresent(data: E): Boolean {
        return 0 == data.id
    }
}