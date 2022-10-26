package local.staticdata.generator

class SequenceGenerator {

    companion object {
        private var addressId: Int = 0
        private var electronicAddressId: Int = 0
        private var individualId: Int = 0
        private var involvedPartyId: Int = 0

        fun generateAddressId(): Int {
            addressId++
            return addressId
        }

        fun generateElectronicAddressId(): Int {
            electronicAddressId++
            return electronicAddressId
        }

        fun generateIndividualId(): Int {
            individualId++
            return individualId
        }

        fun generateInvolvedPartyId(): Int {
            involvedPartyId++
            return involvedPartyId
        }
    }
}