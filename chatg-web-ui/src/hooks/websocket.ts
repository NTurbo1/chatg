import { useState } from "react"

export const useWebSocket = (url: string): WebSocket => {
    const socket: WebSocket = new WebSocket(url)

    socket.addEventListener("open", (event) => {
        socket.send("Hello, buddy!")
    })

    socket.addEventListener("message", (event) => {
        console.log("Message from server: ", event.data)
    })

    return socket
}

export const useConnections = () => {
    const [connections, setConnections] = useState<WebSocket[]>([])

    return {
        connections,
        setConnections
    }
}