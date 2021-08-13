//13082021_10118387_IF-9_IgaFebyolaMambi
package com.example.uts_akb_10118387_if_9_igafebyolamambi;

import android.graphics.drawable.GradientDrawable;

public class CategoriesHelperClass {
    int image;
    String title, gradient;

    public CategoriesHelperClass(int image, String title, String gradient) {
        this.image = image;
        this.title = title;
        this.gradient = gradient;
    }

    public CategoriesHelperClass(GradientDrawable gradient1, int w1, String gradient) {

    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getGradient() {
        return gradient;
    }
}
