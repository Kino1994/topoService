package es.joaquin.topo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public enum Landscape {
	
	FLAT("flat"),
	
	MOUNTAIN("mountain");
	
	private String value;
	
};	