package es.etsit.silcam.bean.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProvinciaResponse {

	@ApiModelProperty(value = "Unique ID")
	private long id;
	
	@ApiModelProperty(value = "Code")
	private String codigo;
	
	@ApiModelProperty(value = "Name")
	private String nombre;
	
}
