package io.github.nturbo1.chatg.controller.response;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ChatUserResponse
{
	private String username;
	private String firstname;
	private String lastname;
}