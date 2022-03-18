package com.efcanteli.fotrografo.model.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.efcanteli.fotrografo.model.TipoUsuario;

@Converter(autoApply = true)
public class TipoUsuarioConverter implements AttributeConverter<TipoUsuario, String>{

	@Override
	public String convertToDatabaseColumn(TipoUsuario attribute) {
		// TODO Auto-generated method stub
		if (attribute == null) {
			return null;
		}
		return attribute.getNombre();
	}

	@Override
	public TipoUsuario convertToEntityAttribute(String dbData) {
		// TODO Auto-generated method stub
		if (dbData == null) {
			return null;
		}
		return TipoUsuario.from(dbData);
	}

}
