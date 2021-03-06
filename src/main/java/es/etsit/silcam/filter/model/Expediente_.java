package es.etsit.silcam.filter.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import es.etsit.silcam.entity.EstadoSolicitud;
import es.etsit.silcam.entity.Expediente;
import es.etsit.silcam.entity.FaseExpediente;
import es.etsit.silcam.entity.PersonaFisica;
import es.etsit.silcam.entity.PersonaJuridica;
import es.etsit.silcam.entity.TipoPersona;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Expediente.class)
public class Expediente_ {

	public static volatile SingularAttribute<Expediente, Long> id;
	public static volatile SingularAttribute<Expediente, String> numeroExpediente;
	public static volatile SingularAttribute<Expediente, Date> fechaInicio;
	public static volatile SingularAttribute<Expediente, FaseExpediente> fase;
	public static volatile SingularAttribute<Expediente, EstadoSolicitud> estado;
	public static volatile SingularAttribute<Expediente, PersonaFisica> solicitanteFisico;
	public static volatile SingularAttribute<Expediente, PersonaJuridica> solicitanteJuridico;
	public static volatile SingularAttribute<Expediente, TipoPersona> tipoSolicitante;
	
}
