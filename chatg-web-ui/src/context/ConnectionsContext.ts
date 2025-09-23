import { createContext } from "react"

interface IConnectionsContextVal {
    connections: WebSocket[]
    setConnections?: (...args: any) => void
}

export const ConnectionsContext = createContext<IConnectionsContextVal>({
    connections: [],
})