package org.grails.plugins.swagger

import grails.converters.JSON

class ResourcesListService {

    static transactional = false

    def grailsApplication
    def grailsUrlMappingsHolder

	def listAll() {

        /* This gets all urlMappings */
        def urlMappingsCollector = { [
          path: it.urlData.logicalUrls.first()
        ] }

        def urlMappings =
            grailsUrlMappingsHolder.urlMappings.collect(urlMappingsCollector)

        /* Gathering all information */
        def root =
            grailsApplication.with {
                return [
                    apiVersion: metadata['app.version'],
                    swaggerVersion : config.swaggerVersion ,
                    apis: urlMappings
                ]
            }

        return root

	}


}
