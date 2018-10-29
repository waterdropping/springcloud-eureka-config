package example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/config")
public class TestConfigClient {

	@Value("${myblog.name}")
	private String name;
	
	@Value("${myblog.url}")
	private String url;
	
	@Value("${myblog.location}")
	private String location;
	
	@GetMapping("/bloginfo")
	public String getBlogInfo() {
		return "get from github repo: " 
	             + ", name=" + name
	             + ", url=" + url
	             + ", location=" + location;
	}
}
