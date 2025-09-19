package io.github.nturbo1.chatg.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import lombok.RequiredArgsConstructor;

import io.github.nturbo1.chatg.service.ChannelService;
import io.github.nturbo1.chatg.service.dto.ChannelDto;

import java.util.List;

@RestController
@RequestMapping("api/v1/channels")
@RequiredArgsConstructor
public class ChannelController
{
	private final ChannelService channelService;

	@GetMapping("/channels")
	public ResponseEntity<List<ChannelDto>> getChannels()
	{
		List<ChannelDto> channels = channelService.getChannels();

		return ResponseEntity
				.ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body(channels);
	}
}