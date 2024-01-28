package www.futbolmanager.com.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import www.futbolmanager.com.entidad.UsuarioLoginEntidad;
import www.futbolmanager.com.servicio.UsuarioLoginServicio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/futbol-manager")
@CrossOrigin("http://localhost:3000")
public class UsuarioLoginControlador {
    @Autowired
    UsuarioLoginServicio usuarioLoginServicio;

    @PostMapping("/usuario/{nombreUsuarioIntroducido}")
    public ResponseEntity<Map<String, Boolean>>  loguearUsuario(@PathVariable String nombreUsuarioIntroducido, @RequestBody Map<String, String> requestBody) {
        Map<String, Boolean> respuestaLogin = new HashMap<>();
        String credencialUsuarioIntroducida = requestBody.get("credencialUsuarioIntroducida");
        List<UsuarioLoginEntidad> todosUsuarios = usuarioLoginServicio.obtenerTodosUsuarios();

        for (UsuarioLoginEntidad usuarioBuscado: todosUsuarios) {
            if (usuarioBuscado.getNombre().equals(nombreUsuarioIntroducido) && usuarioBuscado.getCredencial().equals(credencialUsuarioIntroducida)) {
                respuestaLogin.put("success", true);
            }
        }

        return ResponseEntity.ok(respuestaLogin);
    }
}
