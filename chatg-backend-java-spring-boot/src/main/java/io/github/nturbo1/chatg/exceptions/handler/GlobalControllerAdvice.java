package io.github.nturbo1.chatg.exceptions.handler;

import io.github.nturbo1.chatg.exceptions.UniqueNameException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import jakarta.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@ControllerAdvice
@Slf4j
public class GlobalControllerAdvice
{
	@ExceptionHandler(UniqueNameException.class)
	public ResponseEntity<ErrorResponseBody> handle(HttpServletRequest req, UniqueNameException ex)
	{
		log.error("UniqueNameException was thrown: ", ex);
		return ResponseEntity
				.badRequest()
				.body(
					ErrorResponseBody.builder()
							.status(HttpStatus.BAD_REQUEST.value())
							.path(req.getRequestURI())
							.timestamp(LocalDateTime.now())
							.message(ex.getMessage())
							.build()
				);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponseBody> handle(HttpServletRequest req, Exception ex)
	{
		log.error("General exception handler handled the: ", ex);
		return ResponseEntity
				.internalServerError()
				.body(
					ErrorResponseBody.builder()
							.status(HttpStatus.INTERNAL_SERVER_ERROR.value())
							.path(req.getRequestURI())
							.timestamp(LocalDateTime.now())
							.message(ExceptionMessage.INTERNAL_SERVER_ERROR)
							.build()
				);
	}
}