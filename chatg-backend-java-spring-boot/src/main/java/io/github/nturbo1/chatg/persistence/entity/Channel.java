package io.github.nturbo1.chatg.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="channel")
@Getter
@Setter
public class Channel
{
	@Id
	private Long id;

	@Column
	private String name;
}