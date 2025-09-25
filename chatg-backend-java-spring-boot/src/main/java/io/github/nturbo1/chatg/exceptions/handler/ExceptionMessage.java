package io.github.nturbo1.chatg.exceptions.handler;

import lombok.NoArgsConstructor;
import lombok.AccessLevel;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ExceptionMessage
{
	public static final String INTERNAL_SERVER_ERROR = "Internal Server Error";
	public static final String UNIQUE_CHANNEL_NAME_ERROR_FORMAT = "A channel with name %s already exists.";
}