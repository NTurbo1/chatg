package io.github.nturbo1.chatg.mapper;

import lombok.NoArgsConstructor;
import lombok.AccessLevel;

import io.github.nturbo1.chatg.service.dto.ChatUserDto;
import io.github.nturbo1.chatg.persistence.entity.ChatUser;
import io.github.nturbo1.chatg.controller.response.ChatUserResponse;
import io.github.nturbo1.chatg.controller.request.CreateChatUserRequest;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ChatUserMapper
{
	public static ChatUserDto map(ChatUser entity)
	{
		return ChatUserDto.builder()
				.username(entity.getUsername())
				.firstname(entity.getFirstname())
				.lastname(entity.getLastname())
				.build();
	}

	public static ChatUserResponse map(ChatUserDto dto)
	{
		return ChatUserResponse.builder()
				.username(dto.getUsername())
				.firstname(dto.getFirstname())
				.lastname(dto.getLastname())
				.build();
	}

	public static ChatUser map(CreateChatUserRequest req)
	{
		return ChatUser.builder()
				.username(req.username())
				.firstname(req.firstname())
				.lastname(req.lastname())
				.build();
	}
}