package io.github.nturbo1.chatg.service;

import io.github.nturbo1.chatg.exceptions.handler.ExceptionMessage;
import io.github.nturbo1.chatg.persistence.entity.Channel;
import org.springframework.stereotype.Service;

import io.github.nturbo1.chatg.service.dto.ChannelDto;
import io.github.nturbo1.chatg.persistence.repository.ChannelRepository;
import io.github.nturbo1.chatg.mapper.ChannelMapper;
import io.github.nturbo1.chatg.exceptions.UniqueNameException;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ChannelService
{
	private final ChannelRepository channelRepo;

	public List<ChannelDto> getChannels()
	{
		return ChannelMapper.mapList(this.channelRepo.findAll());
	}

	public boolean createChannel(ChannelDto channelDto)
	{
		verifyUniqueName(channelDto.getName());

		Channel channel = channelRepo.save(ChannelMapper.map(channelDto));
		assertChannel(channel);

		return true;
	}

	private void assertChannel(Channel channel)
	{
		if (channel == null) {
			log.error("Channel repository save method returned null, accepting it as channel creation fail.");
			throw new RuntimeException("Channel was not created. Please, try again in a few minutes.");
		}

		log.debug("Created a new channel entity {}", channel);
	}

	private void verifyUniqueName(String name)
	{
		Optional<Channel> channelOpt = channelRepo.findByName(name);

		if (channelOpt.isPresent()) {
			throw new UniqueNameException(String.format(ExceptionMessage.UNIQUE_CHANNEL_NAME_ERROR_FORMAT, name));
		}
	}
}