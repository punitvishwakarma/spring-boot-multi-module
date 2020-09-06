package com.tcs.git.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Find the hottest repositories created in the last week
 */
@Getter
@Setter
@Data
public class ZeroFollowersDto   {
	
  @JsonProperty("items")
  private List<ListOfItemsDto> items = null;
}

