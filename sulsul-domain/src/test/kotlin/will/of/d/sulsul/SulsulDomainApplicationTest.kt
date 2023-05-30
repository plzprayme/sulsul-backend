package will.of.d.sulsul

import org.junit.jupiter.api.Test
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Import
import will.of.d.sulsul.configuration.JasyptConfig

@SpringBootApplication
@Import(value =  [
    JasyptConfig::class
])
class SulsulDomainApplicationTest {
    @Test
    fun contextLoads() {

    }
}