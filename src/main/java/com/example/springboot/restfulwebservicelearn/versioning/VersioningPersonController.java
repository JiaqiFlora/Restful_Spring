package com.example.springboot.restfulwebservicelearn.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
	
	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getSecondVersionOfPerson() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	@GetMapping(path = "/person", params = "version=1")
	public PersonV1 getFirstVersionOfPersonByParameter1() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/person", params = "version=2")
	public PersonV2 getFirstVersionOfPersonByParameter2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	@GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
	public PersonV1 getFirstVersionOfPersonByHeader1() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
	public PersonV2 getFirstVersionOfPersonByHeader2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	@GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json")
	public PersonV1 getFirstVersionOfPersonByMedia1() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
	public PersonV2 getFirstVersionOfPersonByMedia2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	




}
