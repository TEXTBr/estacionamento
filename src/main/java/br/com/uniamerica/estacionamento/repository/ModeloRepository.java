package br.com.uniamerica.estacionamento.repository;

import br.com.uniamerica.estacionamento.entity.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ModeloRepository extends JpaRepository<Modelo, Long> {
    //public List<Modelo> findByNome(final String nome);

    //buscando da forma customizada
//    @Query("from Modelo whre nome like :nome")
//    public  List<Modelo> findByNomeLike (@Param("nome") final String nome);

    //buscando da forma nativa customizada
//    @Query(value = "select * from modelos where nome like :nome", nativeQuery = true)
//    public  List<Modelo> findByNomeLikeNative (@Param("nome") final String nome);

}