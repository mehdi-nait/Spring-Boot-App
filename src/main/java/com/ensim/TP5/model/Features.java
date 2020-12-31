package com.ensim.TP5.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Features implements Serializable{
	private String type;
	 private String version;
	 ArrayList < Feature > features = new ArrayList < Feature > ();
	 public ArrayList<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(ArrayList<Feature> features) {
		this.features = features;
	}

	private String attribution;
	 private String licence;
	 private String query;
	 private float limit;


	 // Getter Methods 

	 public String getType() {
	  return type;
	 }

	 public String getVersion() {
	  return version;
	 }

	 public String getAttribution() {
	  return attribution;
	 }

	 public String getLicence() {
	  return licence;
	 }

	 public String getQuery() {
	  return query;
	 }

	 public float getLimit() {
	  return limit;
	 }

	 // Setter Methods 

	 public void setType(String type) {
	  this.type = type;
	 }

	 public void setVersion(String version) {
	  this.version = version;
	 }

	 public void setAttribution(String attribution) {
	  this.attribution = attribution;
	 }

	 public void setLicence(String licence) {
	  this.licence = licence;
	 }

	 public void setQuery(String query) {
	  this.query = query;
	 }

	 public void setLimit(float limit) {
	  this.limit = limit;
	 }
}
