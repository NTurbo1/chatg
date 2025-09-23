import { useContext } from "react"
import type { ReactNode } from "react"
import { Outlet } from "react-router"
import styles from "@pages/DashBoard/style.ts"
import { SideNavBar } from "@components/sideNavBar/SideNavBar.tsx"
import { ConnectionsContext } from "@context/ConnectionsContext.ts"
import { ChatLink } from "@components/chat/chatLink/ChatLink.tsx"

interface IProps {

}

export const DashBoardPage = (props: IProps) => {

    const { connections, setConnections } = useContext(ConnectionsContext)
    const chatLinks: ReactNode[] = [
        <ChatLink key = {5174} path="/chat/5174" connectionUrl="ws://localhost:5174">5174</ChatLink>
    ]

    return (
        <>
            <div style={styles.page}>
                <SideNavBar>{ chatLinks }</SideNavBar> 
                <Outlet />
            </div>
        </>
    )
}