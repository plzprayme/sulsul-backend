package will.of.d.sulsul.persistence.mongo

import org.junit.jupiter.api.Test
import will.of.d.sulsul.SharedContext

class SimpleRepositoryTest(
        private val repository: SimpleRepository,
) : SharedContext() {

    @Test
    fun test() {
        repository.save(SimpleEntity(value = "hello"))
        repository.deleteAll()
    }
}