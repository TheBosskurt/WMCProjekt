package net.at.spengergasse.springboot.entity;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
@Setter
@Builder
@Table(name="questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long q_id;

    private boolean q_audited;
    private boolean q_applicable;
    private long q_findingLevel;

 //   @ManyToOne
//    @JoinColumn(name = "a_id", nullable = false)
 //   private Audit audits;

   // @ManyToOne
   // @JoinColumn(name = "l_id", nullable = false)
    //private Law laws;
}
