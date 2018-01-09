run: compile
	java w17_hw01_hw66

compile: w17_hw01_hw66.class Transport.class Car.class Ship.class Plane.class

w17_hw01_hw66.class: w17_hw01_hw66.java Transport.class Car.class Ship.class Plane.class
	javac -encoding utf8 w17_hw01_hw66.java

Transport.class: Transport.java
	javac -encoding utf8 Transport.java

Car.class: Car.java Transport.class
	javac -encoding utf8 Car.java

Ship.class: Ship.java Transport.class
	javac -encoding utf8 Ship.java

Plane.class: Plane.java Transport.class
	javac -encoding utf8 Plane.java

clean:
	del /Q *.class
