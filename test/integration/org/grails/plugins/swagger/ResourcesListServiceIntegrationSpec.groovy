package org.grails.plugins.swagger

import spock.lang.Specification

class ResourcesListServiceIntegrationSpec extends Specification {

    static transactional = false

    def resourcesListService
    def grailsApplication

    def 'Check some basic data'() {
        when:
            def pluginEndpoint = resourcesListService.listAll()
        then:
            with(pluginEndpoint) {
                !apiVersion
                swaggerVersion == '1.2'
                apis.size() > 0
            }
    }


}
