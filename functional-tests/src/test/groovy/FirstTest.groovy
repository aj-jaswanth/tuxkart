import groovyx.net.http.RESTClient
import spock.lang.Specification

/**
 * Created by swarup on 4/25/17.
 */
class FirstTest extends Specification {
    def "The server should be up and listening for requests"() {
        given: "A URI to test"
        def env = "http://localhost:8080"
        def client = new RESTClient(env)
        when: "accessing any page for the uri"
        def response = client.get(path: "/about")
        then: "response should always be OK"
        response.status == 200
    }

}