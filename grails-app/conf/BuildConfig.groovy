grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

    inherits 'global'
    log 'warn'

    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        compile 'com.wordnik:swagger-core_2.10:1.3.1'
        test "org.spockframework:spock-grails-support:0.7-groovy-2.0"
    }

    plugins {
        test(":spock:0.7") {
            exclude("spock-grails-support")
        }
        build ':release:3.0.1', ':rest-client-builder:1.0.3', {
            export = false
        }
        runtime(":hibernate:3.6.10.6") {
            export = false
        }
        runtime ":resources:1.2.1"
    }
}
