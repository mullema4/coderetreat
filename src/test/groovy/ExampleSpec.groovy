import spock.lang.Specification

// MUST extend Specification
class ExampleSpec extends Specification {

    // standard Spock test
    def '1 plus 1 should be 2'() {
        given:
        def a = 1

        when:
        a++

        then:
        a == 2
    }

    // parameterized test
    def '#x plus #y should be #z'() {
        expect:
        x + y == z

        where:
        x  | y  | z
        3  | 4  | 7
        71 | 12 | 83
    }
}
// tutorial: https://www.pluralsight.com/guides/introduction-to-testing-with-bdd-and-the-spock-framework