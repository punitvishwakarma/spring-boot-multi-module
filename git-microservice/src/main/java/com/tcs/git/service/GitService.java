package com.tcs.git.service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import com.tcs.git.dto.ListOfItemsDto;
import com.tcs.git.dto.ZeroFollowersDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class GitService {

	@Value("${git.api.url}")
	private String getApiUrl;

	/**
	 * Find the oldest user accounts with zero followers
	 * 
	 * @param itemsStr
	 * @return listOfItems
	 */
	@ExceptionHandler(WebClientResponseException.class)
	public List<ListOfItemsDto> zeroFollowersList(String itemsStr) {
		log.info("Http call for getting zero followers {}", getApiUrl);
		WebClient webClient = WebClient.create();
		List<ListOfItemsDto> listOfItems = webClient.get().uri(getApiUrl).retrieve().bodyToMono(ZeroFollowersDto.class)
				.block().getItems();
		return Objects.nonNull(itemsStr) ? IntStream.range(0, listOfItems.size()).filter(
				i -> Stream.of(itemsStr.split(",")).map(Integer::parseInt).collect(Collectors.toList()).contains(i))
				.mapToObj(listOfItems::get).collect(Collectors.toList()) : listOfItems;
	}

}
