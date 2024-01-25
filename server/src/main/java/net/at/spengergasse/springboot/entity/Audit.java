package net.at.spengergasse.springboot.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
@Setter
@Builder
@Table(name="audits")
public class Audit  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long a_id;


    private String a_datum;
    private long a_anzTage;
    private String a_leadAuditor;
    private String a_status;
    private String a_ort;
    private String a_thema;
    private String a_typ;

 //   @OneToMany(cascade = CascadeType.ALL, mappedBy = "audit")
 //   private List<Law> laws;

  //  @OneToMany(cascade = CascadeType.ALL, mappedBy = "audit")
 //   private List<Question> questions;
}
