package org.bakkes.fuzzy;

public class FloatHelper {
	public static boolean areEqual(float left, float right) {
		return Math.abs(left - right) < 0.00001f;
	}
}
