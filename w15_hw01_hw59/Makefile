run: compile
	java w15_hw01_hw59

compile: w15_hw01_hw59.class Bike.class Plane.class Ship.class Vehicle.class Delivery.class

w15_hw01_hw59.class: w15_hw01_hw59.java Bike.class Plane.class Ship.class Delivery.class
	javac -encoding utf8 w15_hw01_hw59.java

Bike.class: Bike.java Vehicle.class
	javac -encoding utf8 Bike.java

Plane.class: Plane.java Vehicle.class Delivery.class
	javac -encoding utf8 Plane.java

Ship.class: Ship.java Vehicle.class Delivery.class
	javac -encoding utf8 Ship.java

Vehicle.class: Vehicle.java
	javac -encoding utf8 Vehicle.java

Delivery.class: Delivery.java
	javac -encoding utf8 Delivery.java

compress: compile
	7z a -tzip w15_hw01_hw59.zip w15_hw01_hw59.java Bike.java Plane.java Ship.java Vehicle.java Delivery.java w15_hw01_hw59.class Bike.class Plane.class Ship.class Vehicle.class Delivery.class problem.docx problem.pdf Makefile

clean:
	del *.class
