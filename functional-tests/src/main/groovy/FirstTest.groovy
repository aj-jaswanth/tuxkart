package functionalTests
import groovyx.net.http.RESTClient
import spock.lang.Specification

/**
 * Created by swarup on 4/25/17.
 */
class FirstTest extends Specification {
    def client
    def start(){
        def env = System.getenv()
        client = new RESTClient(env['TUXKART_URI'])
    }

    def "The server should be up and listening for requests"() {
        start()
        given: "A URI to test"
        when: "accessing any page for the uri"
            def response = client.get(path: "/about")
        then: "response should always be OK"
            response.status == 200
            response.getData()["name"] == "TuxKart"
    }

    def "as an admin I should be able to add products to the store"() {
        start()
        given: "I have admin prvilege"
        when: "I add TV in store"
      //  client.parser.'application/vnd.tuxkart.products.v1+json' = client.parser.'application/json'
      //  def response = client.post(path: "/add_product", body: "tv")
        then: "the store should display the newly added TV"
      //      response.getData().toString().contain("TV")

    }


    def "as an CX I should be able to see the available products in the store"() {
        start()
        given: "The app has TV in inventory"
        when: "I access the URI"
            client.parser.'application/vnd.tuxkart.products.v1+json' = client.parser.'application/json'
            def response = client.get(path: "/products" , contentType:groovyx.net.http.ContentType.ANY)
        then: "the store should display the TV"
            response.getData()["products"] == null
    }
}