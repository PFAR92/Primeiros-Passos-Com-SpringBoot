package springjpa.aulaspringdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springjpa.aulaspringdatajpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    
}
