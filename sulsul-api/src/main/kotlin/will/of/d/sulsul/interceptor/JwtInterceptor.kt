package will.of.d.sulsul.interceptor

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerInterceptor


@Component
class JwtInterceptor : HandlerInterceptor {
    @Throws(Exception::class)
    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        val token = request.getToken()
        token?.let {
            // TODO: parse kakao access token
            // TODO2: login or signup
            // TODO3: return 401 if expire
            // TODO4: return 401 if no token
        } ?: {
            // return 401
            false
        }

        return request.getToken()?.let { token ->
            // OAUTH TOKEN
//            accessToken
//            val accessToken: String
//            API 인증에 사용하는 엑세스 토큰.
//
//            accessTokenExpiresAt
//            val accessTokenExpiresAt: Date
//            엑세스 토큰 만료 시각.
//
//            refreshToken
//            val refreshToken: String
//            엑세스 토큰을 갱신하는데 사용하는 리프레시 토큰.
//
//            refreshTokenExpiresAt
//            val refreshTokenExpiresAt: Date
//            리프레시 토큰 만료 시각.
//
//            scopes
//            val scopes: List<String>? = null
//            이 토큰에 부여된 scope 목록.


//            ACCESSTOKEN
//            appId
//            val appId: Int
//            해당 access token이 발급된 앱 ID
//
//                    expiresIn
//            val expiresIn: Long
//            해당 access token의 남은 만료시간 (단위: 초)
//
//            expiresInMillis
//            @SerializedName(value = "expiresInMillis")
//            val expiresInMillis: Long?
//            id
//            val id: Long?
//            회원번호
        }
    }

    private fun HttpServletRequest.getToken(): String? {
        return this.getHeader("Authorization")
                ?.let { token ->
                    if (token.startsWith("Bearer ")) {
                        token.replaceFirst("Bearer ", "")
                    } else {
                        null
                    }
                }
    }
}
