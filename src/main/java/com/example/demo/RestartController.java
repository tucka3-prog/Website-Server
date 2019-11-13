package com.example.demo;

import org.springframework.boot.devtools.restart.Restarter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestartController {

	@CrossOrigin(origins = "https://tucka3-prog.github.io/")
	@GetMapping("/restart")
	public void restart() {
		Restarter.getInstance().restart();
	}
}
//
//@RestController
//public class RestartController {
//
//@GetMapping("/restart")
//void restart() {
//    Thread restartThread = new Thread(() -> {
//        Main.restartApp();
//    });
//    restartThread.setDaemon(false);
//    restartThread.start();
//}
//}