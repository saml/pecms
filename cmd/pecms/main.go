package main

import (
	"flag"
	"fmt"

	"github.com/gin-gonic/gin"
)

func main() {
	var port int
	flag.IntVar(&port, "port", 8080, "Port to listen to ")
	flag.Parse()

	addr := fmt.Sprintf(":%d", port)

	r := gin.Default()
	r.GET("/", func(c *gin.Context) {
		c.String(200, "hello")
	})

	fmt.Printf("Listening to http://localhost%s\n", addr)
	r.Run(addr)
}
