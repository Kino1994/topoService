package es.joaquin.topo.model.api;

import es.joaquin.topo.entities.Topo.Landscape;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TopoResponse {
	
	private String id;
	
	private Landscape landscape;
	
}
