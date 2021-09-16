@Library('shared-lib-unitTesting')_
import org.junit.Test
import static org.junit.Assert.assertEquals
class SimpleUnitTest {
   @Test
   void shouldAdd() {
     assertEquals("Groovy should add correctly", 2, 1 + 1)
   }

   @Test
   void Temperatureconverter() {
       assert 36 == def temp(95)
   }
}
