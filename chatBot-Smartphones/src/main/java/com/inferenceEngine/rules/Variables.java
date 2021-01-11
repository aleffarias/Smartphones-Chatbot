package com.inferenceEngine.rules;

public class Variables {
	
	private boolean ultraHd;
	private boolean android;
	private boolean battery;
	private boolean frontalCamera;
	private boolean colorScreen;
	private boolean flash3g;
	private boolean flash4g;
	private boolean gyroscope;
	private boolean fingerprintScanner;
	private boolean storage;
	private boolean mp3;
	private boolean dualSim;
	private boolean processor ;
	private boolean screenQuality;
	private boolean smartphone;
	private boolean keybord;
	private boolean technology;
	private boolean hdScreen;

	
	
	// Singleton design pattern 
	private static Variables uniqueInstance;
	
	public static synchronized Variables getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new Variables();
		
		return uniqueInstance;
	}

	
	// ======================================= Get/Set =================================================
	public boolean isUltraHd() {
		return ultraHd;
	}

	public void setUltraHd(boolean ultraHd) {
		this.ultraHd = ultraHd;
	}

	public boolean isAndroid() {
		return android;
	}

	public void setAndroid(boolean android) {
		this.android = android;
	}

	public boolean isBattery() {
		return battery;
	}

	public void setBattery(boolean battery) {
		this.battery = battery;
	}

	public boolean isFrontalCamera() {
		return frontalCamera;
	}

	public void setFrontalCamera(boolean frontalCamera) {
		this.frontalCamera = frontalCamera;
	}

	public boolean isColorScreen() {
		return colorScreen;
	}

	public void setColorScreen(boolean colorScreen) {
		this.colorScreen = colorScreen;
	}

	public boolean isFlash3g() {
		return flash3g;
	}

	public void setFlash3g(boolean flash3g) {
		this.flash3g = flash3g;
	}

	public boolean isFlash4g() {
		return flash4g;
	}

	public void setFlash4g(boolean flash4g) {
		this.flash4g = flash4g;
	}

	public boolean isGyroscope() {
		return gyroscope;
	}

	public void setGyroscope(boolean gyroscope) {
		this.gyroscope = gyroscope;
	}

	public boolean isFingerprintScanner() {
		return fingerprintScanner;
	}

	public void setFingerprintScanner(boolean fingerprintScanner) {
		this.fingerprintScanner = fingerprintScanner;
	}

	public boolean isStorage() {
		return storage;
	}

	public void setStorage(boolean storage) {
		this.storage = storage;
	}

	public boolean isMp3() {
		return mp3;
	}

	public void setMp3(boolean mp3) {
		this.mp3 = mp3;
	}

	public boolean isDualSim() {
		return dualSim;
	}

	public void setDualSim(boolean dualSim) {
		this.dualSim = dualSim;
	}

	public boolean isProcessor() {
		return processor;
	}

	public void setProcessor(boolean processor) {
		this.processor = processor;
	}

	public boolean isScreenQuality() {
		return screenQuality;
	}

	public void setScreenQuality(boolean screenQuality) {
		this.screenQuality = screenQuality;
	}

	public boolean isSmartphone() {
		return smartphone;
	}

	public void setSmartphone(boolean smartphone) {
		this.smartphone = smartphone;
	}

	public boolean isKeybord() {
		return keybord;
	}

	public void setKeybord(boolean keybord) {
		this.keybord = keybord;
	}

	public boolean isTechnology() {
		return technology;
	}

	public void setTechnology(boolean technology) {
		this.technology = technology;
	}

	public boolean isHdScreen() {
		return hdScreen;
	}

	public void setHdScreen(boolean hdScreen) {
		this.hdScreen = hdScreen;
	}
	
}
