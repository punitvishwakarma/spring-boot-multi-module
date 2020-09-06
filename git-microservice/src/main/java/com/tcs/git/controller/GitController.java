package com.tcs.git.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.git.commons.Constants;
import com.tcs.git.dto.ListOfItemsDto;
import com.tcs.git.service.GitService;

@RestController
public class GitController {

	@Autowired
	GitService gitService;

	@CrossOrigin
	@GetMapping(path = Constants.ZERO_FOLLOWRS)
	public ResponseEntity<List<ListOfItemsDto>> getHighestStarredList(
			@RequestParam(name = "items", required = false) String items) {
		return new ResponseEntity<>(gitService.zeroFollowersList(items), HttpStatus.OK);
	}
}
