package io.github.nturbo1.chatg.mapper;

import lombok.NoArgsConstructor;
import lombok.AccessLevel;

import io.github.nturbo1.chatg.service.dto.ChannelDto;
import io.github.nturbo1.chatg.persistence.entity.Channel;
import io.github.nturbo1.chatg.controller.request.ChannelRequest;

import java.util.List;
import java.util.ArrayList;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ChannelMapper {
	public static ChannelDto map(Channel entity)
	{
		return ChannelDto.builder().name(entity.getName()).build();
	}

	public static List<ChannelDto> mapList(List<Channel> entityList)
	{
		List<ChannelDto> list = new ArrayList<>(entityList.size());

		for (Channel ent : entityList)
		{
			list.add(map(ent));
		}

		return list;
	}

	public static Channel map(ChannelDto dto)
	{
		return Channel.builder()
				.name(dto.getName())
				.build();
	}

	public static ChannelDto map(ChannelRequest req)
	{
		return ChannelDto.builder()
				.name(req.name())
				.build();
	}
}