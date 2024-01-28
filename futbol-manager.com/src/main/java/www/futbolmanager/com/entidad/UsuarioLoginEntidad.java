package www.futbolmanager.com.entidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor@NoArgsConstructor
@Getter@Setter
@Entity
@Table (name = "LOGIN_USUARIO")
public class UsuarioLoginEntidad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nombre;
    @Column(nullable = false, updatable = false)
    private String credencial;
}
