package io.github.nturbo1.chatg.exceptions.handler;

import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import io.github.nturbo1.chatg.exceptions.RepoEntityNotFoundException;
import io.github.nturbo1.chatg.exceptions.UniqueNameException;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import java.time.LocalDateTime;

@ControllerAdvice
@Slf4j
public class GlobalControllerAdvice
{
	@ExceptionHandler(RepoEntityNotFoundException.class)
	public ResponseEntity<ErrorResponseBody> handle(HttpServletRequest req, RepoEntityNotFoundException ex)
	{
		log.error("Handled RepoEntityNotFoundException exception: ", ex);
		return ResponseEntity
				.status(HttpStatus.NOT_FOUND)
				.body(
					ErrorResponseBody.builder()
							.status(HttpStatus.NOT_FOUND.value())
							.path(req.getRequestURI())
							.timestamp(LocalDateTime.now())
							.message(ex.getMessage())
							.build()
				);
	}

	@ExceptionHandler(UniqueNameException.class)
	public ResponseEntity<ErrorResponseBody> handle(HttpServletRequest req, UniqueNameException ex)
	{
		log.error("Handled UniqueNameException exception: ", ex);
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

	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<ErrorResponseBody> handle(HttpServletRequest req, HttpMessageNotReadableException ex)
	{
		log.error("Handled HttpMessageNotReadableException exception: ", ex);
		return ResponseEntity
				.badRequest()
				.body(
						ErrorResponseBody.builder()
								.status(HttpStatus.BAD_REQUEST.value())
								.path(req.getRequestURI())
								.timestamp(LocalDateTime.now())
								.message("Bad request, buddy :)")
								.build()
				);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponseBody> handle(HttpServletRequest req, Exception ex)
	{
		log.error("General exception handler handled: ", ex);
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