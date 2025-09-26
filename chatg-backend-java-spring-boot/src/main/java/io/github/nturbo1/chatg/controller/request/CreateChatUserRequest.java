package io.github.nturbo1.chatg.controller.request;

public record CreateChatUserRequest(
	String username,
	String firstname,
	String lastname
) {}