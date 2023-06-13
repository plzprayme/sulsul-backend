package will.of.d.sulsul.exceptionhandler

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import will.of.d.sulsul.exception.InvalidRequestException
import will.of.d.sulsul.exception.Unauthorized
import will.of.d.sulsul.exception.UserNotFoundException

@RestControllerAdvice
class SulSulExceptionHandler {

    @ExceptionHandler(InvalidRequestException::class)
    fun invalidRequestException(exception: InvalidRequestException): ResponseEntity<Any> {
        return ResponseEntity.badRequest().body(exception.message)
    }

    @ExceptionHandler(UserNotFoundException::class)
    fun userNotFoundException(exception: UserNotFoundException): ResponseEntity<Any> {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build()
    }

    @ExceptionHandler(Unauthorized::class)
    fun unauthorizedException(exception: Unauthorized): ResponseEntity<Any> {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(exception.message)
    }

    @ExceptionHandler(Exception::class)
    fun exception(): ResponseEntity<Any> {
        return ResponseEntity.internalServerError().build()
    }
}
