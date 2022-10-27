package infrastructure.common.repository

import infrastructure.common.entity.BaseEntity
import local.staticdata.AbstractStaticData
import kotlin.math.abs

abstract class AbstractRepository<E: BaseEntity> (val abstractStaticData: AbstractStaticData<E>) {

    fun getEntity(id: Int): E {
        return abstractStaticData.get(id)
    }

    fun removeEntity(e: E) {
        abstractStaticData.delete(e.id)
    }

    fun getAll(): List<E> {
        return abstractStaticData.getAll()
    }

    fun add(e: E): E {
        return abstractStaticData.persist(e)
    }

    fun update(e: E): E{
        //Check if data exist
        //Abstract will throw error if it does not exist
        abstractStaticData.get(e.id)
        return abstractStaticData.persist(e)
    }

    fun addAll(e: List<E>): List<E> {
        return abstractStaticData.persistAll(e)
    }

    fun purge() {
        abstractStaticData.deleteAll()
    }

}