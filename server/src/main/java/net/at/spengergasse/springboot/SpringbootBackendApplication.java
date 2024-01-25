package net.at.spengergasse.springboot;

import net.at.spengergasse.springboot.entity.Audit;
import net.at.spengergasse.springboot.entity.Law;
import net.at.spengergasse.springboot.entity.Question;
import net.at.spengergasse.springboot.repository.AuditsRepository;
import net.at.spengergasse.springboot.repository.LawsRepository;
import net.at.spengergasse.springboot.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private LawsRepository lawsRepository;
	@Autowired
	private AuditsRepository auditsRepository;
	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public void run(String... args) throws Exception {

		Law law1= Law.builder()
				.gesetz("1")
				.typ("A")
				.gueltigAb("11.11.2043")
				.text("Drogen legal")
				.bezeichnung("DL")
				.build();

		Law law2= Law.builder()
				.gesetz("2")
				.typ("A")
				.gueltigAb("21.10.1920")
				.text("Drogen illegal")
				.bezeichnung("DI")
				.build();


		Law law3= Law.builder()

				.gesetz("3")
				.typ("B")
				.gueltigAb("11.11.2023")
				.text("Rauchen Verboten")
				.bezeichnung("RV")
				.build();

		Law law4= Law.builder()
				.gesetz("4")
				.typ("A")
				.gueltigAb("11.11.2043")
				.text("Drogen legal")
				.bezeichnung("DL")
				.build();

		Law law5= Law.builder()
				.gesetz("5")
				.typ("A")
				.gueltigAb("21.10.1920")
				.text("Drogen illegal")
				.bezeichnung("DI")
				.build();


		Law law6= Law.builder()
				.gesetz("6")
				.typ("B")
				.gueltigAb("11.11.2023")
				.text("Rauchen Verboten")
				.bezeichnung("RV")
				.build();

		Law law7= Law.builder()
				.gesetz("7")
				.typ("B")
				.gueltigAb("21.10.2025")
				.text("Kiffen erlaubt")
				.bezeichnung("KE")
				.build();


		Audit audit1= Audit.builder()
				.a_anzTage(33)
				.a_datum("10.11.2021")
				.a_typ("a")
				.a_ort("Wien")
				.a_leadAuditor("Bozkurt")
				.a_status("fertig")
				.a_thema("aaa")
				.build();


		Question que1= Question.builder()
				.q_applicable(true)
				.q_audited(true)
				.q_findingLevel(5)
				.build();

		lawsRepository.save(law1);
		lawsRepository.save(law2);
		lawsRepository.save(law3);
		lawsRepository.save(law4);
		lawsRepository.save(law5);
		lawsRepository.save(law6);
		lawsRepository.save(law7);
		auditsRepository.save(audit1);
		questionRepository.save(que1);
	}
}
