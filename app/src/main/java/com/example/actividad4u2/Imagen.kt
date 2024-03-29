package com.example.actividad4u2

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint

class Imagen(l:Lienzo, im:Int, posx:Float,posy:Float){
    var x= posx
    var y = posy
    var imagen = BitmapFactory.decodeResource(l.resources,im)
    var invisible = false

    fun pintar(c:Canvas) {
        if(invisible) return;
        c.drawBitmap(imagen, x, y, Paint())
    }
    fun estaEnArea(toqueX:Float,toqueY:Float):Boolean{
        var x2 = x + imagen.width
        var y2 = y + imagen.height
        if (toqueX >= x && toqueX<=x2){
            if(toqueY>= y && toqueY<=y2){
                return true
            }
        }
        return false
    }

    fun mover(toqueX: Float,toqueY: Float){
        x = toqueX-imagen.width/2
        y = toqueY-imagen.height/2
    }

    fun colision(objetoB:Imagen):Boolean{
        var x2 = x+imagen.width
        var y2 = y+imagen.height
        if(objetoB.estaEnArea(x,y)){
            return true
        }
        if(objetoB.estaEnArea(x2,y)){
            return true
        }
        if(objetoB.estaEnArea(x,y2)){
            return true
        }
        if(objetoB.estaEnArea(x2,y2)){
            return true
        }
        return false
    }

}