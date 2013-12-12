package org.grails.plugins.swagger

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(ResourcesListController)
class ResourcesListControllerUnitSpec extends Specification {

    def 'Listing url mappings'() {
        when: 'Mocking the resources list service'
            def resourcesListService = Stub(ResourcesListService)

            resourcesListService.listAll() >> [
                    apiVersion: "1.0",
                    swaggerVersion: "1.2",
                    apis: [
                        [path:"/"]
                    ]
                ]

            controller.resourcesListService = resourcesListService
            controller.index()
        and: 'Taking json response'
            def jsonResponse = response.json
            assert jsonResponse
        then: 'Making sure everything is ok'
            jsonResponse.apiVersion
            jsonResponse.swaggerVersion
            jsonResponse.apis.size() > 0

    }

}
