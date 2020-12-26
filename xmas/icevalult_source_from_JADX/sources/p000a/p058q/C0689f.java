package p000a.p058q;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: a.q.f */
public class C0689f {
    /* renamed from: a */
    public static <T> ObjectAnimator m3390a(T target, Property<T, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimator.ofObject(target, property, (TypeConverter) null, path);
        }
        return ObjectAnimator.ofFloat(target, new C0693h(property, path), new float[]{0.0f, 1.0f});
    }
}
