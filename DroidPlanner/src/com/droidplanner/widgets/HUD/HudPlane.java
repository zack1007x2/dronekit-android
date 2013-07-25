package com.droidplanner.widgets.HUD;

import android.graphics.Canvas;
import android.graphics.Paint;

public class HudPlane {

	// in relation to averaged of width and height
	static final float HUD_FACTOR_CENTER_INDICATOR_SIZE = .0375f;

	public int hudCenterIndicatorRadius;
	public Paint plane = new Paint();

	public HudPlane() {
	}

	void setupPlane(HUDwidget huDwidget) {
		hudCenterIndicatorRadius = Math
				.round((huDwidget.width + huDwidget.height) / 2
						* HUD_FACTOR_CENTER_INDICATOR_SIZE);
	}

	void drawPlane(HUDwidget huDwidget, Canvas canvas) {
		canvas.drawCircle(0, 0, hudCenterIndicatorRadius, plane);
		canvas.drawLine(-hudCenterIndicatorRadius, 0,
				-hudCenterIndicatorRadius * 2, 0, plane);
		canvas.drawLine(hudCenterIndicatorRadius, 0,
				hudCenterIndicatorRadius * 2, 0, plane);
		canvas.drawLine(0, -hudCenterIndicatorRadius, 0,
				-hudCenterIndicatorRadius * 2, plane);
	}
}