package org.grails.plugins.swagger

import grails.plugin.spock.IntegrationSpec

class ResourcesListServiceIntegrationSpec extends IntegrationSpec {

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
