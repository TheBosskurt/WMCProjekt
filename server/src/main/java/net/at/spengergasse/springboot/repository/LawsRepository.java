package net.at.spengergasse.springboot.repository;

import net.at.spengergasse.springboot.entity.Law;
import net.at.spengergasse.springboot.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LawsRepository extends JpaRepository<Law, Long> {
}
