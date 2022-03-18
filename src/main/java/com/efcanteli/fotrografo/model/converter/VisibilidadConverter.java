package com.efcanteli.fotrografo.model.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.efcanteli.fotrografo.model.Visibilidad;

@Converter(autoApply = true)
public class VisibilidadConverter implements AttributeConverter<Visibilidad, String> {

	@Override
	public String convertToDatabaseColumn(Visibilidad attribute) {
		// TODO Auto-generated method stub
		if (attribute == null) {
			return null;
		}
		return attribute.getNombre();
	}

	@Override
	public Visibilidad convertToEntityAttribute(String dbData) {
		// TODO Auto-generated method stub
		if (dbData == null) {
			return null;
		}

		return Visibilidad.from(dbData);
	}

}
