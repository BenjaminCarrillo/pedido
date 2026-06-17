package ecomarket.pedido_ms.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Direccion {
    private Long idDireccion;
    private String calle;
    private String numero;
    private String region;
    private String ciudad;
    private String comuna;
    private Integer codigoPostal;
}
