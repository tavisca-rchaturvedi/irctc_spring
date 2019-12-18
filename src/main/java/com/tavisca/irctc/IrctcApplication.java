package com.tavisca.irctc;

import com.tavisca.irctc.enums.BerthType;
import com.tavisca.irctc.models.Station;
import com.tavisca.irctc.models.Stop;
import com.tavisca.irctc.models.Train;
import com.tavisca.irctc.services.AdminService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.*;

@SpringBootApplication
public class IrctcApplication {

	public static void main(String[] args) {

		SpringApplication.run(IrctcApplication.class, args);


	}

}
