package roman.lazarchik.FirstRestApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import roman.lazarchik.FirstRestApp.models.Person;


@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {


}
