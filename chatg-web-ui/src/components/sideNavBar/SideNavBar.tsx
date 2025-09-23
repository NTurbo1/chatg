import styles from "@components/sideNavBar/style.ts"
import type { ReactNode } from "react"

interface IProps {
    children: ReactNode[]
}

export const SideNavBar = (props: IProps) => {
    const { children } = props;

    return (
        <div style={styles.sideBarContainer}>
            <div style={styles.sideBar}>
                {children}
            </div>
        </div>
    )
}