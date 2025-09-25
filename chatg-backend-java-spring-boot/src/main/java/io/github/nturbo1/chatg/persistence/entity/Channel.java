package io.github.nturbo1.chatg.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;

import lombok.*;

@Entity
@Table(name="channel")
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Channel
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "channel_seq_gen")
	@SequenceGenerator(
		name = "channel_seq_gen",
		sequenceName = "channel_seq",
		allocationSize = 50
	)
	private Long id;

	@Column
	private String name;
}