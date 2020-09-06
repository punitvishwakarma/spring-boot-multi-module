package com.tcs.git;

import com.intuit.karate.junit5.Karate;


class ZeroFollowersTest {

	@Karate.Test
	Karate zeroFollowersSuccess() {
		return Karate.run("zeroFollowers_success").relativeTo(getClass());
	}	
	
	@Karate.Test
	Karate zeroFollowersWithOutParam() {
		return Karate.run("zeroFollowers_withOutParam").relativeTo(getClass());
	}
	
	@Karate.Test
	Karate zeroFollowersWithParam() {
		return Karate.run("zeroFollowers_withParam").relativeTo(getClass());
	}

}
