

package com.example.actividad4u2

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View
import java.util.ArrayList
import  java.util.Random
//< José Eduardo Hez ULLoa >

@Suppress("UNREACHABLE_CODE")
class Lienzo(p:MainActivity): View(p){
    var squirtle = Imagen(this,R.drawable.topo,200f,100f)
    var pikcahu = Imagen(this,R.drawable.topo,700f,100f)
    var pikcahu2 = Imagen(this,R.drawable.topo,1200f,100f)
    var chikorita = Imagen(this,R.drawable.topo,200f,600f)
    var bulvazor = Imagen(this,R.drawable.topo,700f,600f)
    var squirtle2 = Imagen(this,R.drawable.topo,1200f,600f)
    var chikorita2 = Imagen(this,R.drawable.topo,200f,1100f)
    var chikorita3 = Imagen(this,R.drawable.topo,700f,1100f)
    var chikorita4 = Imagen(this,R.drawable.topo,1200f,1100f)
    var topoaplastado = Imagen(this,R.drawable.topoaplastado,200f,100f)
    var topoaplastado2 = Imagen(this,R.drawable.topoaplastado,700f,100f)
    var topoaplastado3 = Imagen(this,R.drawable.topoaplastado,1200f,100f)
    var topoaplastado4 = Imagen(this,R.drawable.topoaplastado,200f,600f)
    var topoaplastado5 = Imagen(this,R.drawable.topoaplastado,700f,600f)
    var topoaplastado6 = Imagen(this,R.drawable.topoaplastado,1200f,600f)
    var topoaplastado7 = Imagen(this,R.drawable.topoaplastado,200f,1100f)
    var topoaplastado8 = Imagen(this,R.drawable.topoaplastado,700f,1100f)
    var topoaplastado9 = Imagen(this,R.drawable.topoaplastado,1200f,1100f)

    var contadorHilo=0
    var hilo=Hilo(this)
    var golpiador = Imagen(this,R.drawable.mazo,200f,1600f)
    var mensaje ="No has presionado"
    var puntero : Imagen?=null
    fun getLienzo(): Lienzo{
        return this
    }

    override fun draw(c: Canvas?) {
        super.draw(c)
        val p = Paint()


        if (c != null) {
            c.drawColor(Color.GREEN)
        }

        if (c != null) {
            if (contadorHilo<=200){
            p.color=Color.BLACK
            c.drawCircle(300f,200f,200f,p)
                if(contadorHilo>20 && contadorHilo<50) {
                    c.drawBitmap(squirtle.imagen, squirtle.x, squirtle.y, p)
                    c.drawBitmap(topoaplastado.imagen, topoaplastado.x, topoaplastado.y, p)
                    squirtle.pintar(c)
                    topoaplastado.pintar(c)
                    topoaplastado.invisible=true
                }
            }

            if (contadorHilo<=200){
            p.color=Color.BLACK
            c.drawCircle(800f,200f,200f,p)
                if(contadorHilo>30 && contadorHilo<60) {
                    c.drawBitmap(pikcahu.imagen, pikcahu.x, pikcahu.y, p)
                    c.drawBitmap(topoaplastado2.imagen, topoaplastado2.x, topoaplastado2.y, p)
                    pikcahu.pintar(c)
                    topoaplastado2.pintar(c)
                    topoaplastado2.invisible=true
                }
            }

            p.color=Color.BLACK
            c.drawCircle(1300f,200f,200f,p)
            if(contadorHilo>35 && contadorHilo<58) {
                c.drawBitmap(pikcahu2.imagen, pikcahu2.x, pikcahu2.y, p)
                c.drawBitmap(topoaplastado3.imagen, topoaplastado3.x, topoaplastado3.y, p)
                pikcahu2.pintar(c)
                topoaplastado3.pintar(c)
                topoaplastado3.invisible=true
            }
            p.color=Color.BLACK
            c.drawCircle(300f,700f,200f,p)
            if(contadorHilo>35 && contadorHilo<58) {
                c.drawBitmap(chikorita.imagen, chikorita.x, chikorita.y, p)
                c.drawBitmap(topoaplastado4.imagen, topoaplastado4.x, topoaplastado4.y, p)
                chikorita.pintar(c)
                topoaplastado4.pintar(c)
                topoaplastado4.invisible=true
            }
            p.color=Color.BLACK
            c.drawCircle(800f,700f,200f,p)
            if(contadorHilo>37 && contadorHilo<59) {
                c.drawBitmap(bulvazor.imagen, bulvazor.x, bulvazor.y, p)
                c.drawBitmap(topoaplastado5.imagen, topoaplastado5.x, topoaplastado5.y, p)
                bulvazor.pintar(c)
                topoaplastado5.pintar(c)
                topoaplastado5.invisible=true
            }
            p.color=Color.BLACK
            c.drawCircle(1300f,700f,200f,p)
            if(contadorHilo>22 && contadorHilo<49) {
                c.drawBitmap(squirtle2.imagen, squirtle2.x, squirtle2.y, p)
                c.drawBitmap(topoaplastado6.imagen, topoaplastado6.x, topoaplastado6.y, p)
                squirtle2.pintar(c)
                topoaplastado6.pintar(c)
                topoaplastado6.invisible=true
            }
            p.color=Color.BLACK
            c.drawCircle(800f,1200f,200f,p)
            if(contadorHilo>22 && contadorHilo<49) {
                c.drawBitmap(chikorita2.imagen, chikorita2.x, chikorita2.y, p)
                c.drawBitmap(topoaplastado7.imagen, topoaplastado7.x, topoaplastado7.y, p)
                chikorita2.pintar(c)
                topoaplastado7.pintar(c)
                topoaplastado7.invisible=true
            }
            //p.color=Color.BLACK
            //c.drawCircle(300f,1200f,200f,p)
            if(contadorHilo>24 && contadorHilo<52) {
                c.drawBitmap(chikorita3.imagen, chikorita3.x, chikorita3.y, p)
                c.drawBitmap(topoaplastado8.imagen, topoaplastado8.x, topoaplastado8.y, p)
                chikorita3.pintar(c)
                topoaplastado8.pintar(c)
                topoaplastado8.invisible=true
            }
            p.color=Color.BLACK
            c.drawCircle(1300f,1200f,200f,p)
            if(contadorHilo>15 && contadorHilo<35) {
                c.drawBitmap(chikorita4.imagen, chikorita4.x, chikorita4.y, p)
                c.drawBitmap(topoaplastado9.imagen, topoaplastado9.x, topoaplastado9.y, p)
                chikorita4.pintar(c)
                topoaplastado9.pintar(c)
                topoaplastado9.invisible=true
            }


            c.drawBitmap(golpiador.imagen,golpiador.x,golpiador.y,p)
            

            golpiador.pintar(c)

            p.color=Color.WHITE
            p.textSize=80f
        }
        if (c != null) {
            c.drawText(mensaje,600f,1800f,p)
        }

        try{
            hilo.start()
        }catch (e:Exception){
        }
    }//canvas
    override fun onTouchEvent(event: MotionEvent): Boolean {
        return super.onTouchEvent(event)
        mensaje = "TOCASTE CANVAS"
            when(event.action){

                MotionEvent.ACTION_DOWN-> {
                  if (golpiador.estaEnArea(event.x,event.y)){
                      puntero=golpiador
                  }


                }
                MotionEvent.ACTION_UP-> {
                    if(squirtle.estaEnArea(event.x,event.y)){
                        mensaje="tocaste squirtle"

                    }

                    if(pikcahu.estaEnArea(event.x,event.y)){
                        mensaje="tocaste pikachu"
                    }

                    if(chikorita.estaEnArea(event.x,event.y)){
                        mensaje="tocaste chikorita"
                    }

                    if(pikcahu2.estaEnArea(event.x,event.y)){
                        mensaje="tocaste pikachu2"
                    }

                    if(squirtle2.estaEnArea(event.x,event.y)){
                        mensaje="tocaste squirtle2"
                    }

                    if(bulvazor.estaEnArea(event.x,event.y)){
                        mensaje="tocaste bulvazor"
                    }

                    if(chikorita2.estaEnArea(event.x,event.y)){
                        mensaje="tocaste chikorita2"
                    }

                    if(chikorita3.estaEnArea(event.x,event.y)){
                        mensaje="tocaste chikorita3"
                    }

                    if(chikorita4.estaEnArea(event.x,event.y)){
                        mensaje="tocaste chikorita4"
                    }
                    puntero=null
                }


                MotionEvent.ACTION_MOVE-> {
                    if(puntero!=null){
                        puntero!!.mover(event.x,event.y)

                        if(puntero==golpiador){
                            if(golpiador.colision(chikorita)){
                                chikorita.invisible=true
                                topoaplastado4.invisible=false
                            }
                        }

                        if(puntero==golpiador){
                            if(golpiador.colision(bulvazor)){
                                bulvazor.invisible=true
                                topoaplastado5.invisible=false
                            }
                        }

                        if(puntero==golpiador){
                            if(golpiador.colision(squirtle)){
                                squirtle.invisible=true
                                topoaplastado.invisible=false
                            }
                        }

                        if(puntero==golpiador){
                            if(golpiador.colision(squirtle2)){
                                squirtle2.invisible=true
                                topoaplastado6.invisible=false
                            }
                        }

                        if(puntero==golpiador){
                            if(golpiador.colision(chikorita2)){
                                chikorita2.invisible=true
                                topoaplastado7.invisible=false
                            }
                        }

                        if(puntero==golpiador){
                            if(golpiador.colision(chikorita3)){
                                chikorita3.invisible=true
                                topoaplastado8.invisible=false
                            }
                        }

                        if(puntero==golpiador){
                            if(golpiador.colision(chikorita4)){
                                chikorita4.invisible=true
                                topoaplastado9.invisible=false
                            }
                        }

                        if(puntero==golpiador){
                            if(golpiador.colision(pikcahu)){
                                pikcahu.invisible=true
                                topoaplastado2.invisible=false
                            }
                        }

                        if(puntero==golpiador){
                            if(golpiador.colision(pikcahu2)){
                                pikcahu2.invisible=true
                                topoaplastado3.invisible=false
                            }
                        }

                    }
                }
            }
        invalidate()
    }

  //canvas
    class Hilo(p:Lienzo):Thread(){
      var may=true
      var mntr = true
      var dspausado=true
      var pnt = p//Existe solo en esta linea.

        fun pausar(){
            dspausado=!dspausado
        }
        fun terminarHilo(){
            mntr=false
        }
        override fun run(){
            super.run()

            while(mntr) {
                if (dspausado == true) {

                    pnt.run {
                        if(may){
                            sleep(10)
                            pnt.contadorHilo++
                            pnt.invalidate()
                            if(pnt.contadorHilo==200){
                                may=false
                            }
                        }else{
                            sleep(10)
                            pnt.contadorHilo--
                            pnt.invalidate()
                            if(pnt.contadorHilo==0){
                                may=true
                            }
                        } }
                }
            }
            sleep(200)
        }
    }
}
/*
*/
