package com.homebrewCult.TheBigBang.util;

import java.util.Random;

import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.model.ModelRenderer;

public class MathUtility {
	
	//Including Max
	public static int randomIntegerInRange(int min, int max) {
		return randomIntegerInRange(min, max, false);
	}
	
	public static int randomIntegerInRange(int min, int max, boolean inclusive) {
		Random r = new Random();
		if(inclusive) {
			return r.nextInt((max - min) + 1) + min;
		} else {
			return r.nextInt((max - min)) + min;
		}
	}
	
	public static double randomDoubleInRange(double min, double max) {
		Random r = new Random();
		return min + (max - min) * r.nextDouble();
	}
	
	public static void addModelBox(ModelRenderer model, float f0, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean bool) {
		model.addBox(f0, f1, f2, f3, f4, f5, f6, f7, f8);
	}
	
	public static MatrixStack getTranslationMatrix(float x, float y, float z) {
		MatrixStack newMatrix = new MatrixStack();
		newMatrix.translate(x, y, z);
		return newMatrix;
	}
}
