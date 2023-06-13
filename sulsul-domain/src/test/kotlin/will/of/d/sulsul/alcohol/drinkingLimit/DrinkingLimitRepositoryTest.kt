package will.of.d.sulsul.alcohol.drinkingLimit

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import will.of.d.sulsul.SharedContext
import will.of.d.sulsul.alcohol.Drink
import will.of.d.sulsul.alcohol.drinkingLimit.domain.DrinkingLimit
import will.of.d.sulsul.alcohol.drinkingLimit.repository.DrinkingLimitRepository

class DrinkingLimitRepositoryTest(
    private val drinkingLimitRepository: DrinkingLimitRepository
) : SharedContext() {

    @Test
    @DisplayName("주량 등록 잘 되는지 확인")
    fun drinkLimitSuccessTest() {
        // given
        val randomKakaoUserId = 2015392L
        val document = DrinkingLimit(id = null, kakaoUserId = randomKakaoUserId, Drink.SOJU.name, 10)

        // when
        val findDocument = drinkingLimitRepository.save(document)

        // then
        Assertions.assertThat(findDocument.id).isNotNull
        Assertions.assertThat(drinkingLimitRepository.findById(findDocument.id!!)).isNotNull
    }
}
