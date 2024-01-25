package net.at.spengergasse.springboot.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.util.List;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
@Setter
@Builder
@Table(name="laws")
public class Law {


   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;


    private String gesetz;
    private String typ;
    private String bezeichnung;
    private String text;
    private String gueltigAb;


 //   @ManyToOne
 //   @JoinColumn(name = "a_id", nullable = false)
 //   private Audit audit;

  //  @OneToMany(cascade = CascadeType.ALL, mappedBy = "audits")
  //  private List<Question> questions;

}
