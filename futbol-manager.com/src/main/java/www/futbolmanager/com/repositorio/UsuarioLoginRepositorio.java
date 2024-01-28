package www.futbolmanager.com.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import www.futbolmanager.com.entidad.UsuarioLoginEntidad;

public interface UsuarioLoginRepositorio extends JpaRepository<UsuarioLoginEntidad, String> {

}
