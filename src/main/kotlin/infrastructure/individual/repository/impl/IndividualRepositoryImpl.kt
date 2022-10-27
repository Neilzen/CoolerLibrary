package infrastructure.individual.repository.impl

import infrastructure.common.repository.AbstractRepository
import infrastructure.individual.entities.Individual
import infrastructure.individual.repository.IndividualRepository
import local.staticdata.AbstractStaticData

class IndividualRepositoryImpl(
    abstractStaticData: AbstractStaticData<Individual>
) : IndividualRepository, AbstractRepository<Individual>(abstractStaticData) {
    override fun addIndividual(individual: Individual): Individual {
        return super.persist(individual)
    }

    override fun getIndividual(id: Int): Individual {
        return super.getEntity(id)
    }

    override fun updateIndividual(individual: Individual): Individual {
        return super.update(individual)
    }
}