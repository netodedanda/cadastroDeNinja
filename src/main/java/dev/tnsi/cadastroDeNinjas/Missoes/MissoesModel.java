package dev.tnsi.cadastroDeNinjas.Missoes;

import dev.tnsi.cadastroDeNinjas.Ninja.Controller.NinjaModel;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table( name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;

}
