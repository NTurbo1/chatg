package io.github.nturbo1.chatg.exceptions.handler;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record ErrorResponseBody(
	int status,
	String path,
	String message,
	LocalDateTime timestamp
) {}