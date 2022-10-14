package springjpa.aulaspringdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import springjpa.aulaspringdatajpa.model.User;
import springjpa.aulaspringdatajpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner{

    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {

        User user1 = new User();
        user1.setName("Paulo");
        user1.setUsername("pfar");
        user1.setPassword("pfr123");

        repository.save(user1);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
        
    }
    
}
