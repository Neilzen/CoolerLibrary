package local.staticdata.library

import infrastructure.library.entities.Inventory
import local.staticdata.AbstractStaticData

class InventoryData: AbstractStaticData<Inventory>(storage = inventoryStorage) {
    
    companion object {
        val inventoryStorage: MutableMap<Int, Inventory> = mutableMapOf()
    }
    
}