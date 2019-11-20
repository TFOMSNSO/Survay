package nsk.tfoms.survay.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * The persistent class for the SURVAY_STACIONAR database table.
 * 
 */
@Entity
@Table(name="SURVAY_STACIONAR")
@NamedQuery(name="SurvayStacionar.findAll", query="SELECT s FROM SurvayStacionar s")
public class SurvayStacionar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private BigDecimal id;

	@Column(name="AGE_STAC")
	private String ageStac;

	@Column(name="AMBULANCE_STAC")
	private String ambulanceStac;

	@Column(name="COMFORT_STAC")
	private String comfortStac;

	@Pattern(regexp = "(0[1-9]|1[0-9]|2[0-9]|3[01]).(0[1-9]|1[012]).[0-9]{4}")
	@Column(name="DATA_INPUT_STAC")
	private String dataInputStac = new SimpleDateFormat("dd.MM.yyyy").format(new Date());

	@Pattern(regexp = "(0[1-9]|1[0-9]|2[0-9]|3[01]).(0[1-9]|1[012]).[0-9]{4}")
	@Column(name="DATA_RESP_STAC")
	private String dataRespStac;

	@Column(name="EQUIPMENT_STAC")
	private String equipmentStac;

	@Column(name="FOOD_STAC")
	private String foodStac;

	@Column(name="LABORATORY_STAC")
	private String laboratoryStac;

	@Column(name="MEDICINE_STAC")
	private String medicineStac;

	@Column(name="QUALITY_AMBULANCE_STAC")
	private String qualityAmbulanceStac;

	@Column(name="QUALITY_STAC")
	private String qualityStac;

	@Column(name="RAPAIRS_STAC")
	private String rapairsStac;

	@Column(name="SEX_STAC")
	private String sexStac;

	@Column(name="TERMS_STAC")
	private String termsStac;

	@Column(name="THERAPIST_STAC")
	private String therapistStac;
	
	@Column(name="MO_STAC")
	private String moonestac;
	
	@Column(name="POLZOVATEL_STAC")
	private String polzovatelonestac;

	public SurvayStacionar() {
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getAgeStac() {
		return this.ageStac;
	}

	public void setAgeStac(String ageStac) {
		this.ageStac = ageStac;
	}

	public String getAmbulanceStac() {
		return this.ambulanceStac;
	}

	public void setAmbulanceStac(String ambulanceStac) {
		this.ambulanceStac = ambulanceStac;
	}

	public String getComfortStac() {
		return this.comfortStac;
	}

	public void setComfortStac(String comfortStac) {
		this.comfortStac = comfortStac;
	}

	public String getDataInputStac() {
		return this.dataInputStac ;
	}

	public void setDataInputStac(String dataInputStac) {
		this.dataInputStac = dataInputStac;
	}

	public String getDataRespStac() {
		return this.dataRespStac;
	}

	public void setDataRespStac(String dataRespStac) {
		this.dataRespStac = dataRespStac;
	}

	public String getEquipmentStac() {
		return this.equipmentStac;
	}

	public void setEquipmentStac(String equipmentStac) {
		this.equipmentStac = equipmentStac;
	}

	public String getFoodStac() {
		return this.foodStac;
	}

	public void setFoodStac(String foodStac) {
		this.foodStac = foodStac;
	}

	public String getLaboratoryStac() {
		return this.laboratoryStac;
	}

	public void setLaboratoryStac(String laboratoryStac) {
		this.laboratoryStac = laboratoryStac;
	}

	public String getMedicineStac() {
		return this.medicineStac;
	}

	public void setMedicineStac(String medicineStac) {
		this.medicineStac = medicineStac;
	}

	public String getQualityAmbulanceStac() {
		return this.qualityAmbulanceStac;
	}

	public void setQualityAmbulanceStac(String qualityAmbulanceStac) {
		this.qualityAmbulanceStac = qualityAmbulanceStac;
	}

	public String getQualityStac() {
		return this.qualityStac;
	}

	public void setQualityStac(String qualityStac) {
		this.qualityStac = qualityStac;
	}

	public String getRapairsStac() {
		return this.rapairsStac;
	}

	public void setRapairsStac(String rapairsStac) {
		this.rapairsStac = rapairsStac;
	}

	public String getSexStac() {
		return this.sexStac;
	}

	public void setSexStac(String sexStac) {
		this.sexStac = sexStac;
	}

	public String getTermsStac() {
		return this.termsStac;
	}

	public void setTermsStac(String termsStac) {
		this.termsStac = termsStac;
	}

	public String getTherapistStac() {
		return this.therapistStac;
	}

	public void setTherapistStac(String therapistStac) {
		this.therapistStac = therapistStac;
	}

	public String getMoonestac() {
		return moonestac;
	}

	public void setMoonestac(String moonestac) {
		this.moonestac = moonestac;
	}

	public String getPolzovatelonestac() {
		return polzovatelonestac;
	}

	public void setPolzovatelonestac(String polzovatelonestac) {
		this.polzovatelonestac = polzovatelonestac;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SurvayStacionar [id=");
		builder.append(id);
		builder.append(", ageStac=");
		builder.append(ageStac);
		builder.append(", ambulanceStac=");
		builder.append(ambulanceStac);
		builder.append(", comfortStac=");
		builder.append(comfortStac);
		builder.append(", dataInputStac=");
		builder.append(dataInputStac);
		builder.append(", dataRespStac=");
		builder.append(dataRespStac);
		builder.append(", equipmentStac=");
		builder.append(equipmentStac);
		builder.append(", foodStac=");
		builder.append(foodStac);
		builder.append(", laboratoryStac=");
		builder.append(laboratoryStac);
		builder.append(", medicineStac=");
		builder.append(medicineStac);
		builder.append(", qualityAmbulanceStac=");
		builder.append(qualityAmbulanceStac);
		builder.append(", qualityStac=");
		builder.append(qualityStac);
		builder.append(", rapairsStac=");
		builder.append(rapairsStac);
		builder.append(", sexStac=");
		builder.append(sexStac);
		builder.append(", termsStac=");
		builder.append(termsStac);
		builder.append(", therapistStac=");
		builder.append(therapistStac);
		builder.append(", moonestac=");
		builder.append(moonestac);
		builder.append(", polzovatelonestac=");
		builder.append(polzovatelonestac);
		builder.append("]");
		return builder.toString();
	}

}
