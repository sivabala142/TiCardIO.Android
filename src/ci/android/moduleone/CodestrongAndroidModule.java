/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ci.android.moduleone;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.titanium.TiApplication;

@Kroll.module(name = "CodestrongAndroid", id = "ci.android.moduleone")
public class CodestrongAndroidModule extends KrollModule {

	// Standard Debugging variables
	private static final String LCAT = "CodestrongAndroidModule";

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;

	public CodestrongAndroidModule() {
		super();
		Log.d(LCAT, "inside CodestrongAndroidModule constructor");
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app) {
		Log.d(LCAT, "inside onAppCreate");
		// put module init code that needs to run when the application is
		// created

	}

}