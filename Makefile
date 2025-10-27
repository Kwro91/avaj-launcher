all:
	javac -d bin ./src/*/*.java
	java -cp bin avaj.Start 

clean:
	rm -rf bin/*/*.class
	rm -rf bin
