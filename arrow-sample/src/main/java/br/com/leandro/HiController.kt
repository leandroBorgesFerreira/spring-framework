package br.com.leandro

import io.reactivex.Single
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HiController() {

  @GetMapping("/hi")
  fun sayHi(): Single<String> {
	  println("lalalalalalal")

	  return Single.just("Hello!")
  }

}