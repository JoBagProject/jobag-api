package com.jobag.jobagapi.security.domain.service;

import com.jobag.jobagapi.security.domain.model.Employer;
import com.jobag.jobagapi.security.domain.model.Postulant;

public interface RegisterService {
    Employer createEmployer(Employer employer);

    Postulant createPostulant(Postulant employer);
}
