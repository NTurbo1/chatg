import { Outlet } from "react-router"
import styles from "@pages/DashBoard/style.ts"
import { SideNavBar } from "@components/SideNavBar/SideNavBar.tsx"

interface IProps {

}

export const DashBoardPage = (props: IProps) => {
    return (
        <>
            <div style={styles.page}>
                <SideNavBar />
                <Outlet />
            </div>
        </>
    )
}