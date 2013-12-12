class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }

        "/api-docs/"(controller:'resourcesList')
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
