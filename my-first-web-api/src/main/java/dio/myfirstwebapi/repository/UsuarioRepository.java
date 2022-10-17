package dio.myfirstwebapi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.myfirstwebapi.model.Usuario;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if(usuario.getId() == null) System.out.println("SAVE - Recebemos o usuário na camada de repositório");
        else System.out.println("UPDATE - Recebemos o usuário na camada de repositório");

        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Paulo", "pf123"));
        usuarios.add(new Usuario("Dani", "dn123"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.printf(String.format("FIND/username - Recebendo o username: %s para localizar um usuário"), id);
        return new Usuario("Paulo", "pf123"); 
    }

    public Usuario findByUserName(String username){
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário" , username));
        return new Usuario("Paulo", "pf123");
    }
}
