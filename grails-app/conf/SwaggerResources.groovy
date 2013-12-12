modules = {
    swagger {
        defaultBundle false

        resource url: 'css/highlight.default.css', plugin: 'swagger', attrs: [media:'screen']
        resource url: 'css/screen.css', plugin: 'swagger', attrs: [media:'screen']

        resource url: 'lib/shred.bundle.js', plugin: 'swagger'
        resource url: 'lib/jquery-1.8.0.min.js', plugin: 'swagger'
        resource url: 'lib/jquery.slideto.min.js', plugin: 'swagger'
        resource url: 'lib/jquery.wiggle.min.js', plugin: 'swagger'
        resource url: 'lib/jquery.ba-bbq.min.js', plugin: 'swagger'
        resource url: 'lib/handlebars-1.0.0.js', plugin: 'swagger'
        resource url: 'lib/underscore-min.js', plugin: 'swagger'
        resource url: 'lib/backbone-min.js', plugin: 'swagger'
        resource url: 'lib/swagger.js', plugin: 'swagger'
        resource url: 'swagger-ui.js', plugin: 'swagger'
        resource url: 'lib/highlight.7.3.pack.js', plugin: 'swagger'
    }
}