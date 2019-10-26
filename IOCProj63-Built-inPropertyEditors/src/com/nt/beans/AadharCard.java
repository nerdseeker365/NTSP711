package com.nt.beans;

import java.io.File;
import java.io.Reader;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

public class AadharCard {
	private long aadharNo;
	private  String name;
	private  Date  dob;
	private  String[]  moles;
	private  File  photoPath;
	private  Locale  locale;
	private  URL    linkedInURL;
	private  URI    linkedInURI;
	private  Class   curClazz;
	private  float   age;
	private  char    favoriteLetter;
	private  char[]  favoriteLetters;
	private  long[]  phones;  
	private   boolean isHandicapted;
	private   Reader   fileReader;
	private Pattern pattern;
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setMoles(String[] moles) {
		this.moles = moles;
	}
	public void setPhotoPath(File photoPath) {
		this.photoPath = photoPath;
	}
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	public void setLinkedInURL(URL linkedInURL) {
		this.linkedInURL = linkedInURL;
	}
	public void setLinkedInURI(URI linkedInURI) {
		this.linkedInURI = linkedInURI;
	}
	public void setCurClazz(Class curClazz) {
		this.curClazz = curClazz;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public void setFavoriteLetter(char favoriteLetter) {
		this.favoriteLetter = favoriteLetter;
	}
	public void setFavoriteLetters(char[] favoriteLetters) {
		this.favoriteLetters = favoriteLetters;
	}
	public void setPhones(long[] phones) {
		this.phones = phones;
	}
	public void setHandicapted(boolean isHandicapted) {
		this.isHandicapted = isHandicapted;
	}
	public void setFileReader(Reader fileReader) {
		this.fileReader = fileReader;
	}
	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}

	@Override
	public String toString() {
		return "AadharCard [aadharNo=" + aadharNo + ", name=" + name + ", dob=" + dob + ", moles="
				+ Arrays.toString(moles) + ", photoPath=" + photoPath + ", locale=" + locale + ", linkedInURL="
				+ linkedInURL + ", linkedInURI=" + linkedInURI + ", curClazz=" + curClazz + ", age=" + age
				+ ", favoriteLetter=" + favoriteLetter + ", favoriteLetters=" + Arrays.toString(favoriteLetters)
				+ ", phones=" + Arrays.toString(phones) + ", isHandicapted=" + isHandicapted + ", fileReader="
				+ fileReader + ", pattern=" + pattern.matcher("as").matches() + "]";
	}
	
	
	
	

}
