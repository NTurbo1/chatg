package io.github.nturbo1.chatg.service.dto;

import lombok.Builder;
import lombok.Setter;
import lombok.Getter;

@Builder
@Getter
@Setter
public class ChatUserDto
{
	private String username;
	private String firstname;
	private String lastname;
}