package com.joaocsousa.library.androidstorage;

import android.os.Environment;

/**
 * Created by joaosousa on 17/08/14.
 */
public enum DirectoryType {

	DIRECTORY_ALARMS(Environment.DIRECTORY_ALARMS),
	DIRECTORY_MUSIC(Environment.DIRECTORY_MUSIC),
	DIRECTORY_PODCASTS(Environment.DIRECTORY_PODCASTS),
	DIRECTORY_NOTIFICATIONS(Environment.DIRECTORY_NOTIFICATIONS),
	DIRECTORY_RINGTONES(Environment.DIRECTORY_RINGTONES),

	DIRECTORY_DCIM(Environment.DIRECTORY_DCIM),
	DIRECTORY_DOCUMENTS(Environment.DIRECTORY_DOCUMENTS),
	DIRECTORY_DOWNLOADS(Environment.DIRECTORY_DOWNLOADS),
	DIRECTORY_MOVIES(Environment.DIRECTORY_MOVIES),
	DIRECTORY_PICTURES(Environment.DIRECTORY_PICTURES);

	private String mType;

	private DirectoryType(String type) {
		mType = type;
	}

}
