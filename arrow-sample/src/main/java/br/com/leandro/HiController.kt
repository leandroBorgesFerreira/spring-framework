package br.com.leandro

import arrow.effects.SingleK
import com.google.gson.Gson
import io.reactivex.Single
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HiController() {

	@GetMapping("/hi")
	fun sayHi(): Single<String> {
		println("lalalalalalal")

		val ha = Gson().fromJson<Single<String>>(SingleK.just("test"))

		println(ha)

		return Single.just("Hello!")
	}

	@GetMapping("/arrow")
	fun arrow(): SingleK<String> {
		println("lalalalalalal")

		return SingleK.just("Hello!")
	}

}