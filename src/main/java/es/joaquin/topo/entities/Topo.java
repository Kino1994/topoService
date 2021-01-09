package es.joaquin.topo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document(collection = "topo")
public class Topo {
	
	@Id
	private String id;
	
	private Landscape landscape;
	
	@AllArgsConstructor
	@Getter
	public enum Landscape {
		
		FLAT("FLAT"),
		
		MOUNTAIN("MOUNTAIN");
		
		private String value;
				
	};	

}
