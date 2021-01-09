package es.joaquin.topo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import es.joaquin.topo.model.api.TopoResponse;
import es.joaquin.topo.service.TopoService;
import reactor.core.publisher.Flux;

@RestController
public class TopoController {
	
	@Autowired
	private TopoService topoService;

	@GetMapping("/api/topographicdetails/{id}")
	public Flux<TopoResponse> getTopographies(@PathVariable String id) {
		return topoService.getTopographies(id).map(topo -> TopoResponse.builder()
			.id(topo.getId())
			.landscape(topo.getLandscape())
			.build());
	}

}
