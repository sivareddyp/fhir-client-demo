package org.bahmni.fhirclientdemo.controller;

import org.bahmni.fhirclientdemo.service.FhirResourceService;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/")
public class FhirResourceController {

    private FhirResourceService fhirResourceService;

    @Autowired
    public FhirResourceController(FhirResourceService fhirResourceService) {
        this.fhirResourceService = fhirResourceService;
    }
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/{resourceType}/{id}")
    public String getResourceByTypeAndId(@PathVariable("resourceType") String resourceType, @PathVariable("id") String id) {
        return fhirResourceService.getResourceById(resourceType, id);
    }

}
