package br.com.leandro

import arrow.effects.SingleK
import arrow.effects.k
import io.reactivex.Single
import kotlinx.coroutines.Dispatchers
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HiController() {

	@GetMapping("/hi")
	fun sayHi(): Single<String> {
		println("lalalalalalal")

		Single.just("Hello!")
				.k()
				.continueOn(Dispatchers.Main)
				.single
				.subscribe { word ->
					println(word)
				}

		return Single.just("Hello!")
	}

	@GetMapping("/arrow")
	fun arrow(): SingleK<String> {
		println("lalalalalalal")

		return SingleK.just("Hello!")
	}

}