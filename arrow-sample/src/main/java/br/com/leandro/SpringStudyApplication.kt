package br.com.leandro

import com.google.gson.Gson
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.http.converter.json.GsonHttpMessageConverter

@SpringBootApplication
@EnableAutoConfiguration(exclude = arrayOf(JacksonAutoConfiguration::class))
class SpringStudyApplication {
	fun gsonHttpMessageConverter(): GsonHttpMessageConverter {
		return GsonHttpMessageConverter(Gson())
	}
}



fun main(args: Array<String>) {
    runApplication<SpringStudyApplication>(*args)
}
