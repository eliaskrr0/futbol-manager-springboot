package www.futbolmanager.com.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.futbolmanager.com.entidad.UsuarioLoginEntidad;
import www.futbolmanager.com.repositorio.UsuarioLoginRepositorio;

import java.util.List;

@Service
public class UsuarioLoginServicio {
    @Autowired
    private UsuarioLoginRepositorio usuarioLoginRepositorio;
    
    public List<UsuarioLoginEntidad> obtenerTodosUsuarios() {
        return usuarioLoginRepositorio.findAll();
    }
}
