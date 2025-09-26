package io.github.nturbo1.chatg.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.nturbo1.chatg.persistence.entity.ChatUser;

import java.util.Optional;

public interface ChatUserRepository extends JpaRepository<ChatUser, Long>
{
	Optional<ChatUser> findByUsername(String username);
}