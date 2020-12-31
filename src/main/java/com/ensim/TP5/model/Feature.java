package com.ensim.TP5.model;

import java.io.Serializable;

public class Feature implements Serializable{
	 private String type;
	 Geometry GeometryObject;
	 Properties PropertiesObject;


	 // Getter Methods 

	 public String getType() {
	  return type;
	 }

	 public Geometry getGeometry() {
	  return GeometryObject;
	 }

	 public Properties getProperties() {
	  return PropertiesObject;
	 }

	 // Setter Methods 

	 public void setType(String type) {
	  this.type = type;
	 }

	 public void setGeometry(Geometry geometryObject) {
	  this.GeometryObject = geometryObject;
	 }

	 public void setProperties(Properties propertiesObject) {
	  this.PropertiesObject = propertiesObject;
	 }
}
	