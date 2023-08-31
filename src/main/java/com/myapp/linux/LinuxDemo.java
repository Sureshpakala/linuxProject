package com.myapp.linux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinuxDemo {
	@GetMapping(value="/Data")
	public String demo() {
		return "This is project on Linux deployment";
	}
}
