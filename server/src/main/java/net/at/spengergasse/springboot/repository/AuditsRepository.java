package net.at.spengergasse.springboot.repository;

import net.at.spengergasse.springboot.entity.Audit;
import net.at.spengergasse.springboot.entity.Law;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditsRepository extends JpaRepository<Audit, Long> {
}
