package io.github.nturbo1.chatg.persistence.entity;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;

import lombok.Getter;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name="chat_user")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ChatUser
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "chat_user_seq_gen")
	@SequenceGenerator(
		name = "chat_user_seq_gen",
		sequenceName = "chat_user_seq",
		allocationSize = 50
	)
	private Long id;
	@Column(name="username")
	private String username;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
}