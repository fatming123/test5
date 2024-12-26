package tw.learn.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.learn.test.medel.users;

public interface Usersrepository extends JpaRepository<users, Integer>{

}
