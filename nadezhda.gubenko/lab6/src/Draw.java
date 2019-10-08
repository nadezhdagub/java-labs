import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;


public class Draw extends View {

    private Paint mPaint = new Paint();

    public Draw(Context context) {
        super(context);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }


    public Bitmap MyDraw(Bitmap bmp, ImageView iv) {
        Canvas canvas = new Canvas(bmp);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(5);
        Random rand;

        int r;
        int g;
        int b;

        for (int i = 1; i <= 30; i++) {
            rand = new Random();

            r = rand.nextInt();
            g = rand.nextInt();
            b = rand.nextInt();

            mPaint.setColor(Color.rgb(r, g, b));

            float t = (rand.nextFloat() * (iv.getWidth())) / 4;

            float rx = ((rand.nextFloat() * (iv.getWidth() - t)));
            float ry = ((rand.nextFloat() * (iv.getHeight() - t)));
            float rw = (rx + t) + 10;
            float rh = (ry + t) + 10;

            canvas.drawRect(rx, ry, rw, rh, mPaint);

            for (int j = 1; j <= 30; j++) {

                rand = new Random();

                r = rand.nextInt();
                g = rand.nextInt();
                b = rand.nextInt();

                mPaint.setColor(Color.rgb(r, g, b));

                float size = rand.nextFloat() * (20 - 10) + 10;
                float cr = (rw - rx) / size;
                float minx, miny, maxx, maxy;
                minx = rx + cr;
                miny = ry + cr;
                maxx = rw - cr;
                maxy = rh - cr;
                float x = rand.nextFloat() * (maxx - minx) + minx;
                float y = rand.nextFloat() * (maxy - miny) + miny;

                canvas.drawCircle(x, y, cr, mPaint);
            }
        }


        return bmp;

    }


    public Bitmap CreateImage(ImageView iv) {

        Bitmap bmp = Bitmap.createBitmap(iv.getWidth(), iv.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmp);

        mPaint.setAntiAlias(true);

        mPaint.setStyle(Paint.Style.FILL);

        mPaint.setColor(Color.WHITE);
        canvas.drawPaint(mPaint);

        return bmp;

    }


}