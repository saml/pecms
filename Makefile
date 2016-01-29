pecms: cmd/pecms/main.go
	wgo build -o "bin/$@" $^

clean:
	rm -rf bin/
