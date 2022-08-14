package tutorials.nullable.allaboutnulls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tutorials.nullable.allaboutnulls.service.SampleService;

@RestController
public class SampleController {

	private final SampleService service;

	public SampleController(SampleService service) {
		this.service = service;
	}
	
	
	@GetMapping(value = "/get")
	public String invoke() {
		service.saveSampleBook();
		return "SUCESS";
	}
	
}
