all:
	javac ./src/*.java
	java -cp src Start 

clean:
	rm -rf src/*.class
