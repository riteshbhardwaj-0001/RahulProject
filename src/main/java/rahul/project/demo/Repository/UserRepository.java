package rahul.project.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rahul.project.demo.Model.UserModel;

public interface UserRepository extends JpaRepository<UserModel,Integer> {
    UserModel findByUsername(String username);
    //  UserModel findById(Integer id);
}
