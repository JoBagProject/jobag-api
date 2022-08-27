package com.jobag.jobagapi.security.domain.service;

import com.jobag.jobagapi.security.domain.model.Employer;
import com.jobag.jobagapi.security.domain.model.Postulant;
import com.jobag.jobagapi.security.resource.SaveAuthenticateResource;

public interface AuthenticateService {
    String authenticateEmployer(SaveAuthenticateResource resource);

    String authenticatePostulant(SaveAuthenticateResource resource);

    Employer authenticateEmployerFilter(String email);

    Postulant authenticatePostulantFilter(String email);
}
