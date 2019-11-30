package com.example.tpdm_u4_practica1_sanchezelizondo

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo(p:MainActivity) : View(p){
    var imagen = BitmapFactory.decodeResource(resources,R.drawable.luna1)

    override fun onDraw(c: Canvas) {
            super.onDraw(c)

            val p = Paint()

            setBackgroundColor(Color.rgb(72,98,218))
            //LO QUE SE PINTA PRIMERO QUEDA MAS AL FONDO Y LO QUE SE PINTA AL UL
                    // TIMO QUEDA MAS ENFRENTE
        p.color = Color.GRAY
        p.textSize=40f
        c.drawCircle(30f,30f,100f,p)



        p.color = Color.WHITE
        p.textSize=40f
        c.drawCircle(100f,1090f,800f,p)

        p.color = Color.GRAY
        p.textSize=40f
        c.drawCircle(1000f,1090f,800f,p)

        p.color = Color.WHITE
        c.drawCircle(500f, 590f, 50f, p)
        p.color = Color.WHITE
        c.drawCircle(500f, 530f, 40f, p)
        p.color = Color.BLACK
        c.drawCircle(510f, 530f, 5f, p)
        c.drawCircle(530f, 520f, 5f, p)
       

        p.color = Color.rgb(90, 74, 7)
        c.drawRect(190f, 520f, 240f, 700f, p)
        p.color = Color.rgb(0, 131, 0)
        c.drawCircle(180f, 530f, 40f, p)
        c.drawCircle(250f, 530f, 40f, p)
        c.drawCircle(220f, 480f, 40f, p)

        p.color = Color.rgb(90, 74, 7)
        c.drawRect(1000f, 520f, 950f, 700f, p)
        p.color = Color.rgb(0, 131, 0)
        c.drawRect(900f, 480f, 1050f, 520f, p)
        c.drawRect(920f, 550f, 1030f, 420f, p)

        p.color = Color.WHITE
        c.drawCircle(50f, 50f, 2f, p)
        c.drawCircle(200f, 280f, 2f, p)
        c.drawCircle(100f, 200f, 2f, p)
        c.drawCircle(400f, 40f, 2f, p)
        c.drawCircle(450f, 170f, 2f, p)
        c.drawCircle(490f, 110f, 2f, p)
        c.drawCircle(500f, 200f, 2f, p)
        c.drawCircle(540f, 75f, 2f, p)
        c.drawCircle(600f, 120f, 2f, p)
        c.drawCircle(650f, 210f, 2f, p)
        c.drawCircle(940f, 50f, 2f, p)
        c.drawCircle(800f, 140f, 2f, p)
        c.drawCircle(750f, 94f, 2f, p)
        c.drawCircle(1050f, 230f, 2f, p)
        c.drawCircle(1010f, 350f, 2f, p)
        c.drawCircle(1250f, 120f, 2f, p)
        c.drawCircle(1105f, 280f, 2f, p)
        c.drawCircle(1450f, 380f, 2f, p)

        p.color=Color.WHITE
        c.drawCircle(630f, 205f, 20f, p)
        c.drawCircle(645f, 180f, 20f, p)
        c.drawCircle(655f, 205f, 20f, p)
        c.drawCircle(665f, 185f, 20f, p)
        c.drawCircle(670f, 205f, 20f, p)

        c.drawCircle(730f, 305f, 20f, p)
        c.drawCircle(745f, 280f, 20f, p)
        c.drawCircle(755f, 305f, 20f, p)
        c.drawCircle(765f, 285f, 20f, p)
        c.drawCircle(770f, 305f, 20f, p)

        c.drawCircle(1030f, 105f, 20f, p)
        c.drawCircle(1045f, 280f, 20f, p)
        c.drawCircle(1055f, 105f, 20f, p)
        c.drawCircle(1065f, 285f, 20f, p)
        c.drawCircle(1070f, 105f, 20f, p)

    }
}