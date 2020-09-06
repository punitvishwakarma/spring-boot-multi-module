package com.tcs.git.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ListOfItemsDto {
	
	@JsonProperty("id")
	private Integer id;

	@JsonProperty("login")
	private String login;
	
	@JsonProperty("html_url")
	private String htmlUrl;

}
