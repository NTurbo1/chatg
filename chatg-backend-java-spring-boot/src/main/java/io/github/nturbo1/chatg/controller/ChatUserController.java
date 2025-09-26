package io.github.nturbo1.chatg.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.nturbo1.chatg.service.ChatUserService;
import io.github.nturbo1.chatg.controller.response.ChatUserResponse;
import io.github.nturbo1.chatg.service.dto.ChatUserDto;
import io.github.nturbo1.chatg.mapper.ChatUserMapper;
import io.github.nturbo1.chatg.controller.request.CreateChatUserRequest;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(
	path = "api/v1/chat-user",
	consumes = MediaType.APPLICATION_JSON_VALUE,
	produces = MediaType.APPLICATION_JSON_VALUE
)
@RequiredArgsConstructor
public class ChatUserController {
	private final ChatUserService chatUserService;

	@GetMapping("/users/{username}")
	public ResponseEntity<ChatUserResponse> getUser(@PathVariable("username") String username)
	{
		ChatUserDto userDto = chatUserService.getUser(username);

		return ResponseEntity
				.ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body(ChatUserMapper.map(userDto));
	}

	@PostMapping("/users")
	public ResponseEntity<ChatUserResponse> createUser(@RequestBody CreateChatUserRequest reqBody)
	{
		ChatUserDto userDto = chatUserService.createUser(reqBody);

		return ResponseEntity
				.ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body(ChatUserMapper.map(userDto));
	}
}
