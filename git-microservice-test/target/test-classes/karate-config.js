function fn() {
	var protocol = "http://";
	var host = "localhost";
	var port = "8081";
	var versionPath = "/api/v1/git-microservice";
	config = {};
	config.microserviceUrl = protocol + host + ":" + port + versionPath;
	return config;
}