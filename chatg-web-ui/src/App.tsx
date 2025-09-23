import { Routes, Route } from "react-router"
import { DashBoardPage } from "@pages/DashBoard/DashBoardPage.tsx"
import { useConnections } from "@hooks/websocket.ts"
import { ConnectionsContext } from "@context/ConnectionsContext.ts"
import { ChatWindow } from "@components/chat/chatWindow/ChatWindow.tsx"

const App = () => {
    const {connections, setConnections} = useConnections()

    return (
        <ConnectionsContext value={
            { connections, setConnections }
        }>
            <Routes>
                <Route path="/" element={<DashBoardPage />}>
                    <Route path="chat/:chatId" element={<ChatWindow />} />
                </Route>
            </Routes>
        </ConnectionsContext>
    )
}

export default App;