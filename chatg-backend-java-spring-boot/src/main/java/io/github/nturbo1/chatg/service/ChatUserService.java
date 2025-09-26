package io.github.nturbo1.chatg.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import io.github.nturbo1.chatg.service.dto.ChatUserDto;
import io.github.nturbo1.chatg.persistence.entity.ChatUser;
import io.github.nturbo1.chatg.persistence.repository.ChatUserRepository;
import io.github.nturbo1.chatg.exceptions.RepoEntityNotFoundException;
import io.github.nturbo1.chatg.exceptions.handler.ExceptionMessage;
import io.github.nturbo1.chatg.mapper.ChatUserMapper;
import io.github.nturbo1.chatg.controller.request.CreateChatUserRequest;
import io.github.nturbo1.chatg.exceptions.UniqueNameException;

@Service
@RequiredArgsConstructor
public class ChatUserService
{
	private final ChatUserRepository chatUserRepo;

	public ChatUserDto getUser(String username)
	{
		ChatUser user = verifyUserExists(username);

		return ChatUserMapper.map(user);
	}

	public ChatUserDto createUser(CreateChatUserRequest request)
	{
		verifyUserNotExists(request.username());
		ChatUser newUser = chatUserRepo.save(ChatUserMapper.map(request));
		assertChatUser(newUser);

		return ChatUserMapper.map(newUser);
	}

	private ChatUser verifyUserExists(String username)
	{
		var userOpt = chatUserRepo.findByUsername(username);
		if (userOpt.isEmpty()) {
			throw new RepoEntityNotFoundException(
				String.format(ExceptionMessage.CHAT_USER_NOT_FOUND_BY_USERNAME_ERROR_FORMAT, username)
			);
		}

		return userOpt.get();
	}

	private void verifyUserNotExists(String username)
	{
		var userOpt = chatUserRepo.findByUsername(username);
		if (userOpt.isPresent()) {
			throw new UniqueNameException(
				String.format(ExceptionMessage.UNIQUE_CHAT_USER_USERNAME_ERROR_FORMAT, username)
			);
		}
	}

	private void assertChatUser(ChatUser user)
	{
		if (user == null) {
			throw new RuntimeException("ChatUser entity shouldn't be null!");
		}
	}
}