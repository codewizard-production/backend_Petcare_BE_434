package com.app.Petcare_BE.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.Petcare_BE.model.Pet;
import com.app.Petcare_BE.model.PetCareCenter;
import com.app.Petcare_BE.model.PetOwner;
import com.app.Petcare_BE.model.Document;
import com.app.Petcare_BE.model.PetService;
import com.app.Petcare_BE.enums.PetServiceType;
import com.app.Petcare_BE.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterBusinessHours")
@Table(schema = "\"petcare_be\"", name = "\"PetCareCenterBusinessHours\"")
@Data
public class PetCareCenterBusinessHours{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"BusinessHours\"")
    private Integer businessHours;
}