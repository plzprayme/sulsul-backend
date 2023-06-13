package will.of.d.sulsul.alcohol.drinkingLimit.service

import org.springframework.stereotype.Service
import will.of.d.sulsul.alcohol.drinkingLimit.dto.request.PostDrinkingLimitReq
import will.of.d.sulsul.alcohol.drinkingLimit.dto.response.DrinkingLimitRes
import will.of.d.sulsul.alcohol.drinkingLimit.repository.DrinkingLimitRepository

@Service
class DrinkingLimitService(
    private val drinkingLimitRepository: DrinkingLimitRepository
) {
    fun save(kakaoUserId: Long, body: PostDrinkingLimitReq): DrinkingLimitRes {
        // TODO : 알코올 계산기 구현하고 추가하기

//        val alcoholAmount = AlcoholCalculator.calculateAlcohol(sojuCount = body.sojuCount, beerCount = body.beerCount)
//        var document = drinkingLimitRepository.save(body.toDocument(alcoholAmount = alcoholAmount))

        var document = drinkingLimitRepository.save(body.toDocument(kakaoUserId = kakaoUserId, alcoholAmount = 0.0))
        document = drinkingLimitRepository.save(document)

        return DrinkingLimitRes.of(document)
    }
}
