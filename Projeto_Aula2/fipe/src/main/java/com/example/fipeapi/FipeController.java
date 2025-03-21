package com.example.fipeapi;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/fipe")
public class FipeController {
    private final String BASE_URL = "https://parallelum.com.br/fipe/api/v1/carros/marcas";
    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/marcas")
    public List<Map<String, Object>> getMarcas() {
        ResponseEntity<List<Map<String, Object>>> response = restTemplate.exchange(
                BASE_URL, 
                org.springframework.http.HttpMethod.GET, 
                null, 
                new ParameterizedTypeReference<List<Map<String, Object>>>() {});
        return response.getBody();
    }

    @GetMapping("/modelos/{marcaId}")
    public Map<String, Object> getModelos(@PathVariable String marcaId) {
        String url = BASE_URL + "/" + marcaId + "/modelos";
        ResponseEntity<Map<String, Object>> response = restTemplate.exchange(
                url, 
                org.springframework.http.HttpMethod.GET, 
                null, 
                new ParameterizedTypeReference<Map<String, Object>>() {});
        return response.getBody();
    }

    @GetMapping("/anos/{marcaId}/{modeloId}")
    public List<Map<String, String>> getAnos(@PathVariable String marcaId, @PathVariable String modeloId) {
        String url = BASE_URL + "/" + marcaId + "/modelos/" + modeloId + "/anos";
        ResponseEntity<List<Map<String, String>>> response = restTemplate.exchange(
                url, 
                org.springframework.http.HttpMethod.GET, 
                null, 
                new ParameterizedTypeReference<List<Map<String, String>>>() {});
        return response.getBody();
    }

    @GetMapping("/valor/{marcaId}/{modeloId}/{anoId}")
    public Map<String, Object> getValor(@PathVariable String marcaId, @PathVariable String modeloId, @PathVariable String anoId) {
        String url = BASE_URL + "/" + marcaId + "/modelos/" + modeloId + "/anos/" + anoId;
        ResponseEntity<Map<String, Object>> response = restTemplate.exchange(
                url, 
                org.springframework.http.HttpMethod.GET, 
                null, 
                new ParameterizedTypeReference<Map<String, Object>>() {});
        return response.getBody();
    }
}
