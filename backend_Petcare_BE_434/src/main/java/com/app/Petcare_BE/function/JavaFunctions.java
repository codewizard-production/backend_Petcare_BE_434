package com.app.Petcare_BE.function;

import com.app.Petcare_BE.model.Pet;
import com.app.Petcare_BE.model.PetCareCenter;
import com.app.Petcare_BE.model.PetOwner;
import com.app.Petcare_BE.model.Document;
import com.app.Petcare_BE.model.PetService;
import com.app.Petcare_BE.enums.PetServiceType;
import com.app.Petcare_BE.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.Petcare_BE.repository.PetServiceRepository;
import com.app.Petcare_BE.repository.PetOwnerRepository;
import com.app.Petcare_BE.repository.PetCareCenterRepository;
import com.app.Petcare_BE.repository.DocumentRepository;
import com.app.Petcare_BE.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
