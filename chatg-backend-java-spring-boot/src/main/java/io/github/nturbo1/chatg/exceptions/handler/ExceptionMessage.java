package io.github.nturbo1.chatg.exceptions.handler;

import lombok.NoArgsConstructor;
import lombok.AccessLevel;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ExceptionMessage
{
	public static final String INTERNAL_SERVER_ERROR = "Internal Server Error";
	public static final String UNIQUE_CHANNEL_NAME_ERROR_FORMAT = "A channel with name %s already exists.";
	public static final String CHAT_USER_NOT_FOUND_BY_USERNAME_ERROR_FORMAT = "User with username %s was not found.";
	public static final String UNIQUE_CHAT_USER_USERNAME_ERROR_FORMAT = "Username %s is already taken.";
}