class SwaggerGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.3 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def title = "Swagger Plugin" // Headline display name of the plugin
    def author = "Alvaro Sanchez-Mariscal"
    def authorEmail = "alvaro.sanchezmariscal@gmail.com"
    def description = '''\
A Grails 2.3+ plugin to generate REST API documentation for your endpoints.
'''

    // URL to the plugin's documentation
    def documentation = "https://github.com/alvarosanchez/grails-swagger"

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"

    def developers = [
        [ name: "Mario Garcia", email: "TODO" ],
        [ name: "Alonso Torres", email: "TODO" ],
        [ name: "Giovanni", email: "TODO" ]
    ]

    // Location of the plugin's issue tracker.
    def issueManagement = [ system: "GitHub", url: "https://github.com/alvarosanchez/grails-swagger/issues" ]

    // Online location of the plugin's browseable source code.
    def scm = [ url: "https://github.com/alvarosanchez/grails-swagger" ]


}
