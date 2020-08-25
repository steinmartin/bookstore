package bookapp

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ProductSpec extends Specification implements DomainUnitTest<Books> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
