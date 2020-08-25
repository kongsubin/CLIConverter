build:
	gradle build
	unzip ./build/distributions/CLIProject.zip                                                                                                                   
 
unzip: 
	rm -rf CLIProject
	unzip ./build/distributions/CLIProject.zip
 
run:
	./CLIProject/bin/CLIProject $(args) 
 
clean:
	rm -rf CLIProject
	rm -rf build
