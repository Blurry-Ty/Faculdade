import math
import turtle

janela = turtle.Screen()


don = turtle.Turtle()
don.color("Blue3")
don.shape("turtle")
don.speed(0)

def quadrado(x):
    don.fillcolor("Blue3")
    don.begin_fill()
    for quad in range(0,4):
        don.left(90)
        don.fd(x)
    don.end_fill()

def circ(y):
    don.fillcolor("white")
    don.begin_fill()
    don.circle(y)
    don.end_fill()

#Primeiro Quadrado
quadrado(512)

#Escrita Maua
don.up()
don.left(90)
don.fd(64)
don.write("Maua", move=False,align="left", font = ('Arial', 256, 'bold'))
don.left(180)
don.fd(64)
don.right(90)
don.fd(256)
don.right(180)

#Circulo Grande
don.down()
circ(256)

#Segundo Quadrado
don.fd(128*math.sqrt(2))
don.left(90)
don.fd(74.98)
don.right(90)
quadrado(256*math.sqrt(2))

#Circulo Grande
don.backward(128*math.sqrt(2))
circ(256*math.sqrt(2)/2)



janela.exitonclick()
turtle.TurtleScreen._RUNNING = True
