package com.photon.phresco.Screens;

import java.io.IOException;

public class PhotonAbstractScreen extends BaseScreen {

	protected PhotonAbstractScreen() {

	}

	protected PhotonAbstractScreen(String selectedBrowser,
			String applicationURL, String applicationContext)
			throws IOException, Exception {
		super(selectedBrowser, applicationURL, applicationContext);
	}

}
