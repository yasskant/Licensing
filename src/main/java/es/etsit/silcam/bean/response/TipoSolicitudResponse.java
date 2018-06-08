package es.etsit.silcam.bean.response;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoSolicitudResponse implements Serializable{

	private static final long serialVersionUID = -3243596191641908203L;

	@ApiModelProperty(value = "Unique ID")
	private long id;
	
	@ApiModelProperty(value = "Code")
	private String codigo;
	
	@ApiModelProperty(value = "Name")
	private String nombre;
	
	@ApiModelProperty(value = "Description")
	private String descripcion;
}
