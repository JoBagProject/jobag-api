package com.jobag.jobagapi.security.controller;

import com.jobag.jobagapi.security.domain.model.Employer;
import com.jobag.jobagapi.security.domain.model.Postulant;
import com.jobag.jobagapi.security.domain.service.RegisterService;
import com.jobag.jobagapi.security.resource.EmployerResource;
import com.jobag.jobagapi.security.resource.PostulantResource;
import com.jobag.jobagapi.security.resource.SaveEmployerResource;
import com.jobag.jobagapi.security.resource.SavePostulantResource;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private RegisterService registerService;

    @PostMapping("/employer")
    @Operation(summary = "Create Employer", description = "Create Employer")
    public ResponseEntity<EmployerResource> registerEmployer(@RequestBody SaveEmployerResource resource) {
        Employer entity = mapper.map(resource, Employer.class);
        Employer result = registerService.createEmployer(entity);
        EmployerResource response = mapper.map(result, EmployerResource.class);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/postulant")
    @Operation(summary = "Create Postulant", description = "Create Postulant")
    public ResponseEntity<PostulantResource> registerPostulant(@RequestBody SavePostulantResource resource) {
        Postulant entity = mapper.map(resource, Postulant.class);
        Postulant result = registerService.createPostulant(entity);
        PostulantResource response = mapper.map(result, PostulantResource.class);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
