package de.kurka.phonegap.client.geolocation;

import com.google.gwt.core.client.JavaScriptObject;

public final class Position extends JavaScriptObject {

	protected Position() {

	}

	public native Coordinates getCoordinates()/*-{
		return this.coords;
	}-*/;

	//TODO this is empty on iPhone 4.1 
	public native double getTimeStamp()/*-{
		return this.timestamp;
	}-*/;

}