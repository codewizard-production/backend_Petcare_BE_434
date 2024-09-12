package com.app.Petcare_BE.function;

import com.app.Petcare_BE.model.Pet;
import com.app.Petcare_BE.model.PetCareCenter;
import com.app.Petcare_BE.model.PetOwner;
import com.app.Petcare_BE.model.Document;
import com.app.Petcare_BE.model.PetService;




import com.app.Petcare_BE.enums.PetServiceType;
import com.app.Petcare_BE.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  