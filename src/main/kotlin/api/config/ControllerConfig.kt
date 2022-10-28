package api.config

import api.AccountController
import core.config.CoreConfig
import infrastructure.config.RepositoryConfig

class ControllerConfig(
    private val coreConfig: CoreConfig,
) {

    fun accountController(): AccountController {
        return AccountController(coreConfig.accountService())
    }

}