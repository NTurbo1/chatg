package io.github.nturbo1.chatg.persistence.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import io.github.nturbo1.chatg.persistence.entity.Channel;

import java.util.Optional;

@Repository
public interface ChannelRepository extends JpaRepository<Channel, Long> {
	Optional<Channel> findByName(String name);
}