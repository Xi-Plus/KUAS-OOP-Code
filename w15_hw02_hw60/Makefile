run: compile
	java w15_hw02_hw60

compile: w15_hw02_hw60.class Phone.class internet.class Telephone.class Cellphone.class Tablet.class

w15_hw02_hw60.class: w15_hw02_hw60.java Telephone.class Cellphone.class Tablet.class
	javac -encoding utf8 w15_hw02_hw60.java

Telephone.class: Telephone.java Phone.class
	javac -encoding utf8 Telephone.java

Cellphone.class: Cellphone.java Phone.class internet.class
	javac -encoding utf8 Cellphone.java

Tablet.class: Tablet.java Phone.class internet.class
	javac -encoding utf8 Tablet.java

Phone.class: Phone.java
	javac -encoding utf8 Phone.java

internet.class: internet.java
	javac -encoding utf8 internet.java

compress: compile
	7z a -tzip w15_hw02_hw60.zip w15_hw02_hw60.java Phone.java internet.java Telephone.java Cellphone.java Tablet.java w15_hw02_hw60.class Phone.class internet.class Telephone.class Cellphone.class Tablet.class problem.docx problem.pdf Makefile

clean:
	del *.class
