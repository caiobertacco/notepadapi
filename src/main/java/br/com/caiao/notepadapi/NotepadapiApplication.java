package br.com.caiao.notepadapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class NotepadapiApplication {



	@RequestMapping("/index")
	public String index(){

		Query query = new Query();
		query.addCriteria(Criteria.where("name").is("Java"));


		return "index";
	}



	public static void main(String[] args) {
		SpringApplication.run(NotepadapiApplication.class, args);
	}
}
