package infrastructure.individual.repository

import infrastructure.individual.entities.Address
import infrastructure.individual.entities.ElectronicAddress
import infrastructure.individual.entities.Individual

interface IndividualRepository {

    fun addIndividual(individual: Individual): Individual
    fun getIndividual(id: Int): Individual
    fun updateIndividual(individual: Individual): Individual

}