package io.github.nturbo1.chatg.service;

import org.springframework.stereotype.Service;

import io.github.nturbo1.chatg.service.dto.ChannelDto;
import io.github.nturbo1.chatg.persistence.repository.ChannelRepository;
import io.github.nturbo1.chatg.mapper.ChannelMapper;

import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChannelService
{
	private final ChannelRepository channelRepo;

	public List<ChannelDto> getChannels()
	{
		return ChannelMapper.mapList(this.channelRepo.findAll());
	}
}