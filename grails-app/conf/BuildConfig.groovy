grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.fork = [
    // configure settings for compilation JVM, note that if you alter the Groovy version forked compilation is required
    //  compile: [maxMemory: 256, minMemory: 64, debug: false, maxPerm: 256, daemon:true],

    // configure settings for the test-app JVM, uses the daemon by default
    test: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, daemon:true],
    // configure settings for the run-app JVM
    run: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, forkReserve:false],
    // configure settings for the run-war JVM
    war: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, forkReserve:false],
    // configure settings for the Console UI JVM
    console: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256]
]

grails.project.dependency.resolver = "maven" // or ivy
grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
    }

    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'

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
        build(":release:3.0.1",
              ":rest-client-builder:1.0.3") {
            export = false
        }
        runtime(":hibernate:3.6.10.6") {
            export = false
        }
        runtime ":resources:1.2.1"
    }
}
