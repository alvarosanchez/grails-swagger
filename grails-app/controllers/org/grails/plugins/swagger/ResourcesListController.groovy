package org.grails.plugins.swagger

import grails.converters.JSON

class ResourcesListController {

    def resourcesListService

    def index() {
        def data = resourcesListService.listAll()
        render data as JSON
    }


}
