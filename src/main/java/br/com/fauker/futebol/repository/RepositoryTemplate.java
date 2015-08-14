package br.com.fauker.futebol.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryTemplate<T, ID extends Serializable> extends JpaRepository<T, ID>{

}
