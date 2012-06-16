package tests
import artemis.*
import artemis.utils.*
import org.junit.Test as test
import kotlin.test.*

class ComponentTypeTest{
    test fun initialUse(){
        var tp = artemis.ComponentType()
        var a = tp.getBit()
        var b = tp.getBit()

        assertTrue({a == 1.toLong() })
        assertTrue({b == 2.toLong() })
    }
}