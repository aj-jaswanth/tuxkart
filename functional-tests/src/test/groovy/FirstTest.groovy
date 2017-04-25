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
            response.getData().toString() == "{name=TuxKart}"
    }

    def "as an admin I should be able to add products to the store"() {
        given: "I have admin prvilege"
        when: "I add TV in store"
        //def env = "https://localhost.com:8080"
        //def client = new RESTClient(env)
        //def response = client.post(path: "/add_product", body: "tv")
        then: "the store should display the newly added TV"
        //response.getData().toString().contain("TV")

    }


    def "as an CX I should be able to see the available products in the store"() {
        given: "The app has TV in inventory"
        when: "I access the URI"
        //def env = "https://localhost.com:8080"
        //def client = new RESTClient(env)
        //def response = client.get(path: "/product_list")
        then: "the store should display the TV"
        //response.getData().toString().contain("TV")
    }
}